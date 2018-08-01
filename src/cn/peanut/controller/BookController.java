package cn.peanut.controller;

import cn.peanut.bean.po.*;
import cn.peanut.bean.vo.GameVo;
import cn.peanut.bean.vo.MenuVo;
import cn.peanut.exception.MessageException;
import cn.peanut.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/show.action")
    public String ShowBookList(Model model, Integer page){
        if (page == null) page = 1;
        Integer size = 3;
        List<Book>  bookList = bookService.selectBooksListByPage(page, size);
        model.addAttribute("booksList", bookList);
        return "/book";
    }
}
