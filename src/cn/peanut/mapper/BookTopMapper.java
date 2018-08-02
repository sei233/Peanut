package cn.peanut.mapper;

import cn.peanut.bean.po.BookTopExample;
import cn.peanut.bean.po.BookTopKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookTopMapper {
    int countByExample(BookTopExample example);

    int deleteByExample(BookTopExample example);

    int deleteByPrimaryKey(BookTopKey key);

    int insert(BookTopKey record);

    int insertSelective(BookTopKey record);

    List<BookTopKey> selectByExample(BookTopExample example);

    BookTopKey selectByBookId(Integer bookId);

    int updateByExampleSelective(@Param("record") BookTopKey record, @Param("example") BookTopExample example);

    int updateByExample(@Param("record") BookTopKey record, @Param("example") BookTopExample example);

    void updateByBookTopKey(BookTopKey record);
}