public class PersonTest {
    public static void main(String[] args){
        //创建类的对象
        Person p1 = new Person();

        //调用类的属性：对象.属性
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        //调用方法：对象.方法
        p1.eat();
        p1.talk("Chinese");

        //属性的默认初始化值
        Person p2 = new Person();
        System.out.println(p2.name);
        System.out.println(p2.isMale);
    }
}
class Person{
    //属性
    String name;
    int age = 1;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }

    public void talk(String language){
        System.out.println("人可以说话，使用的是 "+ language);
    }
}
