package com.qianfeng.dao.dto.servce;

import com.qianfeng.dao.dto.WxbGood;

import java.util.List;

public interface WxbGoodService {
    List<WxbGood> queryGoodsPage(Integer page) throws Exception;
    void insertGoods(WxbGood wxbGood);
}
