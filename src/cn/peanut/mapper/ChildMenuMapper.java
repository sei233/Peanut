package cn.peanut.mapper;

import cn.peanut.bean.po.ChildMenu;
import cn.peanut.bean.po.ChildMenuExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChildMenuMapper {
    int countByExample(ChildMenuExample example);

    int deleteByExample(ChildMenuExample example);

    int deleteByPrimaryKey(Integer childMenuId);

    int insert(ChildMenu record);

    int insertSelective(ChildMenu record);

    List<ChildMenu> selectByExample(ChildMenuExample example);

    ChildMenu selectByPrimaryKey(Integer childMenuId);

    int updateByExampleSelective(@Param("record") ChildMenu record, @Param("example") ChildMenuExample example);

    int updateByExample(@Param("record") ChildMenu record, @Param("example") ChildMenuExample example);

    int updateByPrimaryKeySelective(ChildMenu record);

    int updateByPrimaryKey(ChildMenu record);
}