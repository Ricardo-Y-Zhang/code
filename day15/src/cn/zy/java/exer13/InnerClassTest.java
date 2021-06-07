package src.cn.zy.java.exer13;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-06 17:05
 **/
public class InnerClassTest {

    //返回一个实现了Comparable接口的类的对象
    public Comparable getComparable(){

        //创建一个实现了Comparable接口的类：局部内部类
        class MyComparable implements Comparable{

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }

        return new MyComparable();


        //方式二：返回匿名实现类的匿名对象
//        return new Comparable() {
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        };
    }
}


