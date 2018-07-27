package cn.peanut.mapper;

import cn.peanut.bean.po.RoleMenuExample;
import cn.peanut.bean.po.RoleMenuKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMenuMapper {
    int countByExample(RoleMenuExample example);

    int deleteByExample(RoleMenuExample example);

    int deleteByPrimaryKey(RoleMenuKey key);

    int insert(RoleMenuKey record);

    int insertSelective(RoleMenuKey record);

    List<RoleMenuKey> selectByExample(RoleMenuExample example);

    List<RoleMenuKey> selectByRoleId(Integer roleId);

    int updateByExampleSelective(@Param("record") RoleMenuKey record, @Param("example") RoleMenuExample example);

    int updateByExample(@Param("record") RoleMenuKey record, @Param("example") RoleMenuExample example);
}