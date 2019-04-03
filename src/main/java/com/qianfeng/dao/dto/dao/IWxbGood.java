package com.qianfeng.dao.dto.dao;


import com.qianfeng.dao.dto.WxbGood;

import java.util.List;

public interface IWxbGood {
    /**
     * 查询所有商品
     * @param page 分页方法
     * @return
     * @throws Exception
     */
    List<WxbGood> queryGoodsPage(Integer page) throws Exception;
    void insertWxbGood(WxbGood wxbGood);
}
