package cn.peanut.controller;

import cn.peanut.bean.po.*;
import cn.peanut.bean.vo.BookVo;
import cn.peanut.exception.MessageException;
import cn.peanut.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/book")
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    BookTopService bookTopService;

    @Autowired
    BookSubService bookSubService;

    @Autowired
    SubService subService;

    @Autowired
    TopService topService;

    @Autowired
    TopSubService topSubService;

    @RequestMapping("/show1.action")
    public String showBookList1(Model model, Integer page) {
        if (page == null) page = 1;
        Integer size = 3;
        List<Book> bookList = bookService.selectBooksListByPage(page, size);
        List<BookVo> bookVoList = new ArrayList<>();
        Iterator iter = bookList.iterator();

        while (iter.hasNext()) {
            Book book = (Book) iter.next();
            BookVo bookVo = pack(book);
            bookVoList.add(bookVo);
        }

        model.addAttribute("booksList", bookVoList);
        return "/book_mng";
    }

    @RequestMapping("/search.action")
    public String searchBook(Model model, BookVo bookVo) {
        List<BookVo> bookVoList = new ArrayList<>();
        if (bookVo.getBook().getBookId() != null) {
            Book book = bookService.selectBookById(bookVo.getBook().getBookId());
            BookVo bookVo1 = pack(book);
            bookVoList.add(bookVo1);
        } else if (bookVo.getBook().getBookName() != null && !"".equals(bookVo.getBook().getBookName())) {
            BookExample example = new BookExample();
            BookExample.Criteria criteria = example.createCriteria();
            criteria.andBookNameLike("%" + bookVo.getBook().getBookName() + "%");
            List<Book> bookList = bookService.selectByExample(example);
            Iterator iter = bookList.iterator();

            while (iter.hasNext()) {
                Book book = (Book) iter.next();
                BookVo bookVo1 = pack(book);
                bookVoList.add(bookVo1);
            }
        } else {
            List<BookSubKey> bookSubList = bookSubService.selectBySub(bookVo.getSubCtgy().getSubCtgyId());
            Iterator iter = bookSubList.iterator();

            while (iter.hasNext()) {
                BookSubKey bookSubKey = (BookSubKey) iter.next();
                Book book = bookService.selectBookById(bookSubKey.getBookId());
                BookVo bookVo1 = pack(book);
                bookVoList.add(bookVo1);
            }
        }
        model.addAttribute("booksList", bookVoList);
        return "/book_mng";
    }

    @RequestMapping("/getSeconds.action")
    public @ResponseBody
    List<SubCtgy> getSeconds(Model model, TopCtgy topCtgy) {
        List<SubCtgy> data = new ArrayList<>();
        SubCtgy subCtgy;
        List<TopSub> topSub = topSubService.selectByTop(topCtgy.getTopCtgyId());
        Iterator iter = topSub.iterator();

        while (iter.hasNext()) {
            TopSub topSub1 = (TopSub) iter.next();
            subCtgy = subService.selectById(topSub1.getSubCtgyId());
            data.add(subCtgy);
        }

        return data;
    }

    private BookVo pack(Book book) {
        BookVo bookVo = new BookVo();
        bookVo.setBook(book);
        BookTopKey bookTopKey = bookTopService.selectByBookId(book.getBookId());
        TopCtgy topCtgy = topService.selectById(bookTopKey.getTopCtgyId());
        bookVo.setTopCtgy(topCtgy);
        BookSubKey bookSubKey = bookSubService.selectByBookId(book.getBookId());
        SubCtgy subCtgy = subService.selectById(bookSubKey.getSubCtgyId());
        bookVo.setSubCtgy(subCtgy);
        return bookVo;
    }

    @RequestMapping(value = "/update.action", method = RequestMethod.GET)
    public String updateBook(Model model, Integer id) {
        Book book = bookService.selectBookById(id);
        BookVo bookVo = pack(book);
        model.addAttribute("book", bookVo);
        return "/book_update";
    }

    @RequestMapping(value = "/update.action", method = RequestMethod.POST)
    public String updateBook(BookVo bookVo) throws MessageException {
        Book book = bookVo.getBook();
        bookService.update(book);

        TopCtgy topCtgy = bookVo.getTopCtgy();
        BookTopKey bookTopKey = bookTopService.selectByBookId(book.getBookId());
        bookTopKey.setTopCtgyId(topCtgy.getTopCtgyId());
        bookTopService.update(bookTopKey);

        SubCtgy subCtgy = bookVo.getSubCtgy();
        BookSubKey bookSubKey = bookSubService.selectByBookId(book.getBookId());
        bookSubKey.setSubCtgyId(subCtgy.getSubCtgyId());
        bookSubService.update(bookSubKey);
        return "redirect:/book/show1.action";
    }
}
