package com.qianfeng.wxbmemeber.service;

import com.qianfeng.wxbmemeber.mapper.WxMemeberMapper;
import com.qianfeng.wxbmemeber.po.WxbMemeber;
import com.qianfeng.wxbmemeber.vo.LoginInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxMemeberService {
    @Autowired
    private WxMemeberMapper wxMemeberMapper;

    public WxbMemeber login(LoginInfoVO loginInfoVO){
        if (loginInfoVO == null){
            throw new NullPointerException("param is null");
        }
        String phone = loginInfoVO.getPhone();
        String password = loginInfoVO.getPassword();
        if (phone == null){
            throw new NullPointerException("phone is null");
        }
        //1、检验用户名在数据库是否存在
        WxbMemeber wxbMemeber = wxMemeberMapper.login(phone);
        if (wxbMemeber == null){
            throw new NullPointerException("phone not found");
        }

        //2、密码校验
        //a、先对用户传入的密码进行加密

        return null;
    }
}
