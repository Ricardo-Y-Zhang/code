package src.cn.zy.java.exer1;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-05-31 14:21
 **/
public class PersonTest {
    public static void main(String[] args){
        //对象的多态性，父类的引用指向子类的对象
        Person p1 = new Man();

        //虚拟方法调用：多态的使用，当调用子父类同名同参数的方法时，实际执行的是子类重写父类的方法
        p1.eat();

        p1.walk();

        //不能调用子类中所特有的方法、属性；编译时，p1时Person类型
        //p1.earnMoney();

        System.out.println(p1.id);


        System.out.println("向下转型：");

       if(p1 instanceof Man){
           System.out.println("男人");

           Man m1 = (Man) p1;

           m1.earnMoney();

           System.out.println(m1.id);
       }

       if(p1 instanceof Woman){
           System.out.println("女人");

           Woman w1 = (Woman) p1;

           w1.goShopping();

           System.out.println(w1.id);
       }
    }

}
