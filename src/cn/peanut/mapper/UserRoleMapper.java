package cn.peanut.mapper;

import cn.peanut.bean.po.UserRoleExample;
import cn.peanut.bean.po.UserRoleKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRoleMapper {
    int countByExample(UserRoleExample example);

    int deleteByExample(UserRoleExample example);

    int deleteByPrimaryKey(UserRoleKey key);

    void deleteByUserId(Integer id);

    int insert(UserRoleKey record);

    int insertSelective(UserRoleKey record);

    List<UserRoleKey> selectByExample(UserRoleExample example);

    UserRoleKey selectByUserId(Integer userId);

    UserRoleKey selectByRoleId(Integer roleId);

    int updateByExampleSelective(@Param("record") UserRoleKey record, @Param("example") UserRoleExample example);

    int updateByExample(@Param("record") UserRoleKey record, @Param("example") UserRoleExample example);

    void updateRoleId(UserRoleKey record);
}