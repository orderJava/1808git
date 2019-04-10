package com.qianfeng.mapper;

import com.qianfeng.dto.WxbGood;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WxbGoodMapper {
   List<WxbGood> queryGoodsPage(@Param("index") Integer index, @Param("size") Integer size);
   void insertWxbGood(WxbGood wxbGood);
}
