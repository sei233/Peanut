package cn.peanut.service.Impl;

import cn.peanut.bean.po.BookTopKey;
import cn.peanut.exception.MessageException;
import cn.peanut.mapper.BookMapper;
import cn.peanut.mapper.BookTopMapper;
import cn.peanut.service.BookTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class BookTopServiceImpl implements BookTopService {

    @Autowired
    private BookTopMapper bookTopMapper;

    @Override
    public BookTopKey selectByBookId(Integer bookId) {
        return bookTopMapper.selectByBookId(bookId);
    }

    @Override
    public void update(BookTopKey bookTopKey) throws MessageException {
        if(bookTopKey.getTopCtgyId()==null){throw new MessageException("请选择一级分类");}
        bookTopMapper.updateByBookTopKey(bookTopKey);
    }
}
