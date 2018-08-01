package cn.peanut.mapper;

import cn.peanut.bean.po.TopCtgy;
import cn.peanut.bean.po.TopCtgyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TopCtgyMapper {
    int countByExample(TopCtgyExample example);

    int deleteByExample(TopCtgyExample example);

    int deleteByPrimaryKey(Integer topCtgyId);

    int insert(TopCtgy record);

    int insertSelective(TopCtgy record);

    List<TopCtgy> selectByExample(TopCtgyExample example);

    TopCtgy selectByPrimaryKey(Integer topCtgyId);

    int updateByExampleSelective(@Param("record") TopCtgy record, @Param("example") TopCtgyExample example);

    int updateByExample(@Param("record") TopCtgy record, @Param("example") TopCtgyExample example);

    int updateByPrimaryKeySelective(TopCtgy record);

    int updateByPrimaryKey(TopCtgy record);
}