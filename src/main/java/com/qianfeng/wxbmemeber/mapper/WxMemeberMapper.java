package com.qianfeng.wxbmemeber.mapper;

import com.qianfeng.wxbmemeber.po.WxbMemeber;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface WxMemeberMapper {
    WxbMemeber login(@Param("phone") String phone);
}
