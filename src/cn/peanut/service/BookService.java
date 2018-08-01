package cn.peanut.service;

import cn.peanut.bean.po.Book;

import java.util.List;

public interface BookService {
    List<Book> selectBooksListByPage(Integer page, Integer size);
    void deleteBookById(Integer id);
}
