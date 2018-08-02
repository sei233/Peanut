package cn.peanut.service.Impl;

import cn.peanut.bean.po.BookSubKey;
import cn.peanut.bean.po.BookTopKey;
import cn.peanut.exception.MessageException;
import cn.peanut.mapper.BookSubMapper;
import cn.peanut.mapper.BookTopMapper;
import cn.peanut.service.BookSubService;
import cn.peanut.service.BookTopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(isolation = Isolation.REPEATABLE_READ,propagation = Propagation.REQUIRED,readOnly = false)
public class BookSubServiceImpl implements BookSubService {

    @Autowired
    private BookSubMapper bookSubMapper;

    @Override
    public BookSubKey selectByBookId(Integer id) {
        return bookSubMapper.selectByBookId(id);
    }

    @Override
    public List<BookSubKey> selectBySub(Integer id) {
        return bookSubMapper.selectBySub(id);
    }

    @Override
    public void update(BookSubKey bookSubKey) throws MessageException {
        if(bookSubKey.getSubCtgyId()==null){throw new MessageException("请选择二级分类");}
        bookSubMapper.updateByBookSubKey(bookSubKey);
    }
}
