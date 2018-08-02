package cn.peanut.service;

import cn.peanut.bean.po.BookSubKey;
import cn.peanut.exception.MessageException;

import java.util.List;

public interface BookSubService {
    BookSubKey selectByBookId(Integer id);
    List<BookSubKey> selectBySub(Integer id);
    void update(BookSubKey bookSubKey) throws MessageException;
}
