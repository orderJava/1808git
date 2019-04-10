package com.qianfeng.wxbmemeber.vo;

public class LoginInfoVO {
    private String phone;
    private String password;

    public LoginInfoVO() {

    }
    public LoginInfoVO(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
