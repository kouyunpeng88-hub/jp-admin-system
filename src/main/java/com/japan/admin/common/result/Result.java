package com.japan.admin.common.result;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Result<T> {

    private Integer code;

    private String message;

    private T data;

    private LocalDateTime timestamp;

    public static <T> Result<T> success(T data){

        Result<T> r = new Result<>();

        r.setCode(ResultCode.SUCCESS);

        r.setMessage("success");

        r.setData(data);

        r.setTimestamp(LocalDateTime.now());

        return r;

    }

    public static <T> Result<T> error(String message){

        Result<T> r = new Result<>();

        r.setCode(ResultCode.ERROR);

        r.setMessage(message);

        r.setTimestamp(LocalDateTime.now());

        return r;

    }

}