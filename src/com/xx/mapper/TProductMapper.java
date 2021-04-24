package com.xx.mapper;

import com.xx.entity.TProduct;
import com.xx.entity.TProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProductMapper {
    int countByExample(TProductExample example);

    int deleteByExample(TProductExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(TProduct record);

    int insertSelective(TProduct record);

    List<TProduct> selectByExample(TProductExample example);

    TProduct selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") TProduct record, @Param("example") TProductExample example);

    int updateByExample(@Param("record") TProduct record, @Param("example") TProductExample example);

    int updateByPrimaryKeySelective(TProduct record);

    int updateByPrimaryKey(TProduct record);
}