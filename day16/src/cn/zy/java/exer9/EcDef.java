package src.cn.zy.java.exer9;

/**
 * @program: code
 * @description: 用户自定义异常类
 * @author: Mr.Yan
 * @create: 2021-06-09 16:44
 **/

class EcDef extends Exception{
    static final long serialVersionUID = -7034897190745766938L;


    public EcDef(){}

    public EcDef(String message){
        super(message);
    }
}