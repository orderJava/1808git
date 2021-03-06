package com.qianfeng.dao.impl;

import com.qianfeng.commons.info.SystemConstantsUtils;
import com.qianfeng.commons.mybatis.MyBatisSessionFactoryUtils;
import com.qianfeng.dao.IWxbGood;
import com.qianfeng.dto.WxbGood;
import com.qianfeng.mapper.WxbGoodMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IWxbGoodImpl implements IWxbGood {
    @Autowired
    private SqlSession session;
    @Override
    public List<WxbGood> queryGoodsPage(Integer page) throws Exception {
        WxbGoodMapper goodMapper = MyBatisSessionFactoryUtils.getSession().getMapper(WxbGoodMapper.class);
        List<WxbGood> wxbGoods = goodMapper.queryGoodsPage(page, SystemConstantsUtils.Page.PAGE_SIZE);
        return wxbGoods;
    }

    @Override
    public void insertWxbGood(WxbGood wxbGood) {
        WxbGoodMapper goodMapper = session.getMapper(WxbGoodMapper.class);
        goodMapper.insertWxbGood(wxbGood);
        session.commit();
    }


}
