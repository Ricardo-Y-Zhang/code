package cn.zy.java.exer7;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-07-18 17:17
 **/
public class Girl {
    private String name;

    public Girl(String name) {
        this.name = name;
    }

    public Girl() {
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
