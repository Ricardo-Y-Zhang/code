package cn.zy.java.exer7;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-05 18:08
 **/
public class InterfaceExtends {
}

interface AA{
    public abstract void a();
}

interface BB{
    public abstract void b();
}

//接口CC继承AA，BB
interface CC extends AA, BB{
}


//test实现接口CC，必须实现CC中抽象方法
class test implements CC{

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}

