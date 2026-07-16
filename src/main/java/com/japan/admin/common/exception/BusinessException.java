package com.japan.admin.common.exception;

/**
 * 全局异常
 */
public class BusinessException extends RuntimeException{

    public BusinessException(String message){
        super(message);
    }
}
