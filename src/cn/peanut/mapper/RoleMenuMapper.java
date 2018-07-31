package cn.peanut.mapper;

import cn.peanut.bean.po.RoleMenu;
import cn.peanut.bean.po.RoleMenuExample;
import cn.peanut.bean.po.RoleMenuKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMenuMapper {
    int countByExample(RoleMenuExample example);

    int deleteByExample(RoleMenuExample example);

    int deleteByPrimaryKey(RoleMenuKey key);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    List<RoleMenu> selectByExample(RoleMenuExample example);

    RoleMenu selectByPrimaryKey(RoleMenuKey key);

    List<RoleMenuKey> selectByRoleId(Integer roleId);

    int updateByExampleSelective(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    int updateByExample(@Param("record") RoleMenu record, @Param("example") RoleMenuExample example);

    int updateByPrimaryKeySelective(RoleMenu record);

    int updateByPrimaryKey(RoleMenu record);
}