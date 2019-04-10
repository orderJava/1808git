package com.qianfeng.servce;

import com.qianfeng.commons.info.SystemConstantsUtils;
import com.qianfeng.dao.IWxbGood;
import com.qianfeng.dto.WxbGood;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WxbGoodServiceImpl implements WxbGoodService{
    @Autowired
    private IWxbGood iWxbGood;
    @Override
    public List<WxbGood> queryGoodsPage(Integer page) throws Exception {
        if (page < 1){
            throw new IndexOutOfBoundsException("页码不能小于1");
        }
        int index = (page-1)* SystemConstantsUtils.Page.PAGE_SIZE;
        List<WxbGood> wxbGoods = iWxbGood.queryGoodsPage(index);
        return wxbGoods;
    }

    @Override
    public void insertGoods(WxbGood wxbGood) {
        iWxbGood.insertWxbGood(wxbGood);
    }
}
