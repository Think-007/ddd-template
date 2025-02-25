package com.think.www.core;

import java.io.Serializable;

/**
 * 代码不写注释，编程不打日志，像极了你和别人吹NB的样子。
 *
 * @author 北桥南望
 * @since 2021-05-25 10:42
 */
public class TkResult<T> implements Serializable {

    private T data;

    private int code;

    public  TkResult (int code,T data){

        this.code = code;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "TkResult{" +
                "data=" + data +
                ", code=" + code +
                '}';
    }
}
