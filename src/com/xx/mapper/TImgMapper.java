package com.xx.mapper;

import com.xx.entity.TImg;
import com.xx.entity.TImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TImgMapper {
    int countByExample(TImgExample example);

    int deleteByExample(TImgExample example);

    int deleteByPrimaryKey(Integer imgId);

    int insert(TImg record);

    int insertSelective(TImg record);

    List<TImg> selectByExample(TImgExample example);

    TImg selectByPrimaryKey(Integer imgId);

    int updateByExampleSelective(@Param("record") TImg record, @Param("example") TImgExample example);

    int updateByExample(@Param("record") TImg record, @Param("example") TImgExample example);

    int updateByPrimaryKeySelective(TImg record);

    int updateByPrimaryKey(TImg record);
}