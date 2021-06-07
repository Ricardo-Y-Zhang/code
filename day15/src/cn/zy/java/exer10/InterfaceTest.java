package src.cn.zy.java.exer10;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-06 13:04
 **/
public class InterfaceTest {
    public static void main(String[] args) {

        ComparableCircle c1 = new ComparableCircle(1.99);

        ComparableCircle c2 = new ComparableCircle(2.00);

        int compare = c1.compareTo(c2);

        if(compare == 0){
            System.out.println("c1 == c2");
        }else if (compare > 0){
            System.out.println("c1 > c2");
        }else{
            System.out.println("c1 < c2");
        }
    }
}



