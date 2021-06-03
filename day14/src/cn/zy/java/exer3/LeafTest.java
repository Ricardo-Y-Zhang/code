package src.cn.zy.java.exer3;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-03 16:03
 **/
public class LeafTest {
    public static void main(String[] args) {

        //由父及子、静态先行
        leaf l1 = new leaf("maybe");


        System.out.println();

        leaf l2 = new leaf("second");
    }
}

class root{
    static{
        System.out.println("root的静态初始化块");
    }

    {
        System.out.println("root的普通初始化块");
    }
    public root(){
        System.out.println("root的无参构造器");
    }
}

class mid extends root{
    static{
        System.out.println("mid的静态初始化块");
    }

    {
        System.out.println("mid的普通初始化块");
    }

    public mid(){
        System.out.println("mid的无参构造器");
    }

    public mid(String str){
        this();
        System.out.println("mid的有参构造器");
    }
}


class leaf extends mid{
    static {
        System.out.println("leaf的静态初始化快");
    }

    {
        System.out.println("leaf的普通初始化块");
    }

    public leaf(String str){
        super(str);
    }

}


