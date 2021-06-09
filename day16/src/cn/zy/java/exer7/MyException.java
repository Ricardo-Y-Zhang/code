package src.cn.zy.java.exer7;

import javax.crypto.interfaces.PBEKey;

/**
 * @program: code
 * @description: 用户自定义异常类
 * @author: Mr.Yan
 * @create: 2021-06-09 15:30
 **/
public class MyException extends RuntimeException{

    static final long serialVersionUID = -7034897190745766939L;


    public MyException(){}

    public MyException(String message){
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    protected MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
