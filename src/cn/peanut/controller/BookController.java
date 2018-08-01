package cn.peanut.controller;

import cn.peanut.bean.po.*;
import cn.peanut.bean.vo.BookVo;
import cn.peanut.bean.vo.GameVo;
import cn.peanut.bean.vo.MenuVo;
import cn.peanut.exception.MessageException;
import cn.peanut.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/book")
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

    @RequestMapping("/show1.action")
    public String showBookList1(Model model, Integer page){
        if (page == null) page = 1;
        Integer size = 3;
        List<Book> bookList = bookService.selectBooksListByPage(page, size);
        List<BookVo> bookVoList = new ArrayList<>();
        Iterator iter = bookList.iterator();

        while (iter.hasNext()) {
            Book book=(Book)iter.next();
            BookVo bookVo = new BookVo();
            bookVo.setBook(book);
            BookTopKey bookTopKey=bookTopService.selectByBookId(book.getBookId());
            TopCtgy topCtgy = topService.selectById(bookTopKey.getTopCtgyId());
            bookVo.setTopCtgy(topCtgy);
            BookSubKey bookSubKey=bookSubService.selectByBookId(book.getBookId());
            SubCtgy subCtgy = subService.selectById(bookSubKey.getSubCtgyId());
            bookVo.setSubCtgy(subCtgy);
            bookVoList.add(bookVo);
        }

        model.addAttribute("booksList", bookVoList);
        return "/book_mng";
    }

    @RequestMapping("/show.action")
    public String showBookList(Model model, Integer page){
        if (page == null) page = 1;
        Integer size = 3;
        List<Book> bookList = bookService.selectBooksListByPage(page, size);
        List<BookVo> bookVoList = new ArrayList<>();
        Iterator iter = bookList.iterator();

        while (iter.hasNext()) {
            Book book=(Book)iter.next();
            BookVo bookVo = new BookVo();
            bookVo.setBook(book);
            BookTopKey bookTopKey=bookTopService.selectByBookId(book.getBookId());
            TopCtgy topCtgy = topService.selectById(bookTopKey.getTopCtgyId());
            bookVo.setTopCtgy(topCtgy);
            BookSubKey bookSubKey=bookSubService.selectByBookId(book.getBookId());
            SubCtgy subCtgy = subService.selectById(bookSubKey.getSubCtgyId());
            bookVo.setSubCtgy(subCtgy);
            bookVoList.add(bookVo);
        }
        model.addAttribute("booksList", bookVoList);
        return "/book";
    }

    @RequestMapping("/search.action")
    public String searchBook(Model model, BookVo bookVo){

        return "/book_mng";
    }

    @RequestMapping("/getSeconds.action")
    public @ResponseBody
    List<SubCtgy> getSeconds(Model model, TopCtgy topCtgy){
        List<SubCtgy> data =new ArrayList<>();
        SubCtgy subCtgy;
        if(topCtgy.getTopCtgyId()==3){
            subCtgy=subService.selectById(35);
            data.add(subCtgy);
        }else if(topCtgy.getTopCtgyId()==8){
            subCtgy=subService.selectById(85);
            data.add(subCtgy);
        }else if(topCtgy.getTopCtgyId()==9){
            subCtgy=subService.selectById(89);
            data.add(subCtgy);
            subCtgy=subService.selectById(90);
            data.add(subCtgy);
            subCtgy=subService.selectById(91);
            data.add(subCtgy);
        }else if(topCtgy.getTopCtgyId()==13){
            subCtgy=subService.selectById(104);
            data.add(subCtgy);
        }
        return data;
    }
//    @RequestMapping("/delete.action")
//    public String DeleteBook(Model model, Integer id){
//        bookService.deleteBookById(id);
//        return "/book";
//    }
}
