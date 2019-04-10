package com.qianfeng.servce;

import com.qianfeng.dto.WxbGood;

import java.util.List;

public interface WxbGoodService {
    List<WxbGood> queryGoodsPage(Integer page) throws Exception;
    void insertGoods(WxbGood wxbGood);
}
