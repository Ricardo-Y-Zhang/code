package src.cn.zy.team.service;

/**
 * @program: code
 * @description: 自定义异常
 * @author: Mr.Yan
 * @create: 2021-06-11 16:49
 **/
public class TeamException extends Exception{
    static final long serialVersionUID = -3387516993124229947L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
