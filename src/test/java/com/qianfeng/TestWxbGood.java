package com.qianfeng;

import com.qianfeng.dto.WxbGood;
import com.qianfeng.dto.WxbGoodSku;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Date;

public class TestWxbGood {
    @Test
    public void AddWxbGood(){

        try {
            //创建流
            InputStream stream = Resources.getResourceAsStream("mybatis.cfg.xml");
            //构造模式
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
            //工厂模式
            SqlSession session= sessionFactory.openSession();
            WxbGood wxbgood = new WxbGood();
//            Timestamp timestamp = new Timestamp(new Date().getTime());
            Timestamp timestamp = new Timestamp(new Date().getTime());
            wxbgood.setGoodId("1");
            wxbgood.setGoodName("手机");
            wxbgood.setCustomerId("1");
            wxbgood.setGoodPic("1.jpg");
            wxbgood.setGoodPic1("2.jpg");
            wxbgood.setGoodPic2("3.jpg");
            wxbgood.setPromoteDesc("活动");
            wxbgood.setSkuTitle("活动");
            wxbgood.setSkuPrice("4000");
            wxbgood.setSkuPmoney("1000");
            wxbgood.setCopyIds("2");
            wxbgood.setCopyDesc("促销");
            wxbgood.setForwardLink("www.123hao.com");
            wxbgood.setOrderNo(1);
            wxbgood.setTypeId("2");
            wxbgood.setTags("粉丝");
            wxbgood.setState(1);
            wxbgood.setCreateTime(timestamp);
            wxbgood.setToped(1);
            wxbgood.setRecomed(1);
            wxbgood.setTopedTime(timestamp);
            wxbgood.setRecomedTime(timestamp);
            wxbgood.setSpcId("1");
            wxbgood.setZonId("2");
            wxbgood.setSellNum(200);
            wxbgood.setWebsite("www.baidu.com");
            wxbgood.setIswxpay(2);
            wxbgood.setIsfdfk(2);
            wxbgood.setLeixingId(2);
            wxbgood.setKfqq("22");
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void AddWxbGoodSku(){
        try {
            InputStream stream = Resources.getResourceAsStream("mybatis.cfg.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
            SqlSession session = sessionFactory.openSession();
            WxbGoodSku sku = new WxbGoodSku();
            sku.setSkuId("1");
            sku.setSkuName("标配");
            sku.setSkuCost("200");
            sku.setSkuPrice("2200");
            sku.setSkuPmoney("800");
            sku.setGoodId("1");
            sku.setOrderNo(1);
            sku.setServiceMoney("400");
            session.commit();
            session.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
