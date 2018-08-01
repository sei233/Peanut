package cn.peanut.mapper;

import cn.peanut.bean.po.SubCtgy;
import cn.peanut.bean.po.SubCtgyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SubCtgyMapper {
    int countByExample(SubCtgyExample example);

    int deleteByExample(SubCtgyExample example);

    int deleteByPrimaryKey(Integer subCtgyId);

    int insert(SubCtgy record);

    int insertSelective(SubCtgy record);

    List<SubCtgy> selectByExample(SubCtgyExample example);

    SubCtgy selectByPrimaryKey(Integer subCtgyId);

    int updateByExampleSelective(@Param("record") SubCtgy record, @Param("example") SubCtgyExample example);

    int updateByExample(@Param("record") SubCtgy record, @Param("example") SubCtgyExample example);

    int updateByPrimaryKeySelective(SubCtgy record);

    int updateByPrimaryKey(SubCtgy record);
}