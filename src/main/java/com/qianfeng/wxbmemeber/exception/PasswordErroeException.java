package com.qianfeng.wxbmemeber.exception;

/**
 * 手动定义一个异常
 */
public class PasswordErroeException extends Exception{
    public PasswordErroeException(String message){
        super(message);
    }
}
