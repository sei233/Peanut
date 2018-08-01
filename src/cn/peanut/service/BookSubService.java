package cn.peanut.service;

import cn.peanut.bean.po.BookSubKey;

public interface BookSubService {
    BookSubKey selectByBookId(Integer id);
}
