package cn.zy.java.exer7;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-18 17:18
 **/
public class Boy {
    private Girl girl;

    public Boy(Girl girl) {
        this.girl = girl;
    }

    public Boy() {
    }

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "girl=" + girl +
                '}';
    }
}
