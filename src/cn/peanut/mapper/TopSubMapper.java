package cn.peanut.mapper;

import cn.peanut.bean.po.TopSub;
import cn.peanut.bean.po.TopSubExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TopSubMapper {
    int countByExample(TopSubExample example);

    int deleteByExample(TopSubExample example);

    int insert(TopSub record);

    int insertSelective(TopSub record);

    List<TopSub> selectByExample(TopSubExample example);

    List<TopSub> selectByTop(Integer topCtgyId);

    int updateByExampleSelective(@Param("record") TopSub record, @Param("example") TopSubExample example);

    int updateByExample(@Param("record") TopSub record, @Param("example") TopSubExample example);
}