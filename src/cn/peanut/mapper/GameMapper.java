package cn.peanut.mapper;

import cn.peanut.bean.po.Game;
import cn.peanut.bean.po.GameExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GameMapper {
    int countByExample(GameExample example);

    int deleteByExample(GameExample example);

    int deleteByPrimaryKey(Integer gameId);

    int insert(Game record);

    int insertSelective(Game record);

    List<Game> selectByExample(GameExample example);

    List<Game> selectByPage(Integer index,Integer size);

    Game selectByPrimaryKey(Integer gameId);

    Game selectByName(String gameName);

    int updateByExampleSelective(@Param("record") Game record, @Param("example") GameExample example);

    int updateByExample(@Param("record") Game record, @Param("example") GameExample example);

    int updateByPrimaryKeySelective(Game record);

    int updateByPrimaryKey(Game record);
}