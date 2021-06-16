package cn.zy.java.exer12;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-06 16:06
 **/
public class InnerClassTest {
    public static void main(String[] args) {

        //创建Dog实例（静态的成员内部类）
        Person.Dog dog = new Person.Dog();

        dog.show();


        //创建Bird实例（非静态的成员内部类）
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();
    }
}

class Person{

    String name;
    //静态成员内部类
    static class Dog{
        public void show(){
            System.out.println("忠犬八公");
        }
    }

    //非静态成员内部类
    class Bird{
        String name;

        public void sing(){
            System.out.println("我是一只小小鸟");
        }

        public void display(String name){
            //方法形参
            System.out.println(name);
            //内部类属性
            System.out.println(this.name);
            //外部类属性
            System.out.println(Person.this.name);
        }
    }

    public void method(){
        //局部内部类
        class AA{

        }
    }

    {
        //局部内部类
        class BB{

        }
    }

    public Person(){

        //局部内部类
        class CC{

        }
    }

}
