package pers.rong.onism.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 *返回结果封装体
 * @author rongchen
 */
@Data
public class Result implements Serializable {

    /** 200正常，非200异常 */
    private int code;
    /** 提示信息*/
    private String msg;
    /** 返回数据*/
    private Object data;

    public static Result success(Object data){
        return success(200,"请求成功",data);
    }

    public static Result success(int code,String msg,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result fail(String msg){
        return fail(400,msg,null);
    }

    public static Result fail(String msg,Object data){
        return fail(400,msg,data);
    }

    public static Result fail(int code,String msg,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
