package src.cn.zy.team.service;

/**
 * @program: code
 * @description: 自定义异常
 * @author: Mr.Yan
 * @create: 2021-06-11 16:49
 **/
public class TeamException extends Exception{
    static final long serialVersionUID = -338751699312422947L;

    public TeamException() {
        super();
    }

    public TeamException(String message) {
        super(message);
    }
}
