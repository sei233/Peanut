package cn.peanut.service;

import cn.peanut.bean.po.BookTopKey;

public interface BookTopService {
    BookTopKey selectByBookId(Integer bookId);
}
