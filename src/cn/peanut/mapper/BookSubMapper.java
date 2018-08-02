package cn.peanut.mapper;

import cn.peanut.bean.po.BookSubExample;
import cn.peanut.bean.po.BookSubKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookSubMapper {
    int countByExample(BookSubExample example);

    int deleteByExample(BookSubExample example);

    int deleteByPrimaryKey(BookSubKey key);

    int insert(BookSubKey record);

    int insertSelective(BookSubKey record);

    List<BookSubKey> selectByExample(BookSubExample example);

    List<BookSubKey> selectBySub(Integer subId);

    BookSubKey selectByBookId(Integer bookId);

    int updateByExampleSelective(@Param("record") BookSubKey record, @Param("example") BookSubExample example);

    int updateByExample(@Param("record") BookSubKey record, @Param("example") BookSubExample example);
}