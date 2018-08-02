package cn.peanut.service;

import cn.peanut.bean.po.BookTopKey;
import cn.peanut.exception.MessageException;

public interface BookTopService {
    BookTopKey selectByBookId(Integer bookId);
    void update(BookTopKey bookTopKey) throws MessageException;
}
