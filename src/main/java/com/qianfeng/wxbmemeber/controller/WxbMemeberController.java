package com.qianfeng.wxbmemeber.controller;

import com.qianfeng.wxbmemeber.po.WxbMemeber;
import com.qianfeng.wxbmemeber.service.WxMemeberService;
import com.qianfeng.wxbmemeber.vo.LoginInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import javax.servlet.http.HttpSession;

@Controller
public class WxbMemeberController {
    @Autowired
    private WxMemeberService wxMemeberService;

    public String loginMemeber(LoginInfoVO loginInfoVO, HttpSession session){
        WxbMemeber wxbMemeber = wxMemeberService.login(loginInfoVO);
        session.setAttribute("wxbMemeber",wxbMemeber);
        return null;
    }
}
