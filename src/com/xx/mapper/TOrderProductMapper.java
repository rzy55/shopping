package com.xx.mapper;

import com.xx.entity.TOrderProduct;
import com.xx.entity.TOrderProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderProductMapper {
    int countByExample(TOrderProductExample example);

    int deleteByExample(TOrderProductExample example);

    int deleteByPrimaryKey(Integer orderProductId);

    int insert(TOrderProduct record);

    int insertSelective(TOrderProduct record);

    List<TOrderProduct> selectByExample(TOrderProductExample example);

    TOrderProduct selectByPrimaryKey(Integer orderProductId);

    int updateByExampleSelective(@Param("record") TOrderProduct record, @Param("example") TOrderProductExample example);

    int updateByExample(@Param("record") TOrderProduct record, @Param("example") TOrderProductExample example);

    int updateByPrimaryKeySelective(TOrderProduct record);

    int updateByPrimaryKey(TOrderProduct record);
}