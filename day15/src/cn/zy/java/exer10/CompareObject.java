package src.cn.zy.java.exer10;

public interface CompareObject {
    /**
     * description: 返回值0，相等；正数，当前对象大；负数，当前对象小（规范）
     * @param  o
     * @return  int
     * @author: Mr.Yan
     * @date: 2021/6/6
     **/
    public abstract int compareTo(Object o);
}
