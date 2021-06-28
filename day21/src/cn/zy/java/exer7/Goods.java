package cn.zy.java.exer7;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-28 10:27
 **/
public class Goods implements Comparable{
    private String name;
    private double price;

    public Goods(){}

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //指明goods排序方式：价格从低到高,再按名字从低到高
    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods goods = (Goods) o;

            //方式一
            if(this.price > goods.price){
                return 1;
            }else if(this.price < goods.price){
                return -1;
            }else{
                return this.name.compareTo(goods.name);
            }

            //方式二
            //return Double.compare(this.price, goods.price);
        }
        throw new RuntimeException("传入的数据类型不一致");
    }
}
