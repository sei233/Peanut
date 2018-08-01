package cn.peanut.service.Impl;


import cn.peanut.bean.po.Book;
import cn.peanut.mapper.BookMapper;
import cn.peanut.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectBooksListByPage(Integer page, Integer size) {
        return bookMapper.selectByPage(page,size);
    }
}
