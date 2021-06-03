package src.cn.zy.java.exer2;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-05-31 15:49
 **/
public class InstanceTest {
    public void method(Person1 e) {
        if(e instanceof Graduate){
            System.out.println("a graduated student\na student\na person" );
        }else if (e instanceof Student){
            System.out.println("a student\na person");
        }else if(e instanceof Person1){
            System.out.println("a person");
        }
    }
}
