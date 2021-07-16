package cn.zy.java.exer1;

/**
 * @program: code
 * @description: 静态代理举例：代理类和被代理类在编译期间确定
 * @author: Mr.Yan
 * @create: 2021-07-16 13:50
 **/
public class StaticProxyTest {

    public static void main(String[] args) {
        //创建被代理类对象
        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        //创建代理类对象
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nikeClothFactory);

        proxyClothFactory.produceCloth();
    }
}

interface ClothFactory{
    void produceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory{

    private ClothFactory factory;//使用被代理类对象进行实例化

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }


    @Override
    public void produceCloth() {
        System.out.println("代理工厂做准备工作");

        factory.produceCloth();

        System.out.println("代理工厂做后续工作");
    }
}

//被代理类
class NikeClothFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("Nike工厂生产服装");
    }
}