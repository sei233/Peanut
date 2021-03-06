package cn.peanut.service;

import cn.peanut.bean.po.Book;
import cn.peanut.bean.po.BookExample;
import cn.peanut.exception.MessageException;

import java.util.List;

public interface BookService {
    List<Book> selectBooksListByPage(Integer page, Integer size);
    Book selectBookById(Integer id);
    List<Book> selectByExample(BookExample example);
    void deleteBookById(Integer id);
    void update(Book book) throws MessageException;
}
