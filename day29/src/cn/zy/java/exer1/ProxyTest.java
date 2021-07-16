package cn.zy.java.exer1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: code
 * @description: 动态代理举例
 * @author: Mr.Yan
 * @create: 2021-07-16 13:59
 **/

interface Human{
    public String getBelief();
    public void eat(String food);
}

//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "i believe i can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("eat " + food);
    }
}


/*
1. 如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象
2. 当通过代理类的对象调用方法时，如何动态的去调用被代理类中的同名方法
 */

class ProxyFactory{

    //调用此方法，返回一个代理类的对象
    public static Object getProxyInstance(Object obj){//obj：被代理类的对象

        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);//赋值为被代理类对象
        Object o = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
        return o;
    }
}

class MyInvocationHandler implements InvocationHandler{

    private Object obj;//需要使用被代理类对象赋值

    public void bind(Object obj){
        this.obj = obj;
    }



    //当我们通过代理类的对象，调用方法a时，就会自动调用如下的方法：invoke()
    //将被代理类要执行的方法a的功能声明在invoke()中
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        //method：即为代理类对象调用的方法，此方法也就作为被代理类对象要调用的方法
        //obj：被代理类的对象
        Object invoke = method.invoke(obj, objects);

        return invoke;

    }
}

public class ProxyTest {

    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);

        //通过代理对象调用方法时，会自动调用被代理类中同名方法
        System.out.println(proxyInstance.getBelief());
        proxyInstance.eat("四川麻辣烫");


        NikeClothFactory nikeClothFactory = new NikeClothFactory();

        ClothFactory proxyInstance1 = (ClothFactory) ProxyFactory.getProxyInstance(nikeClothFactory);

        proxyInstance1.produceCloth();
    }
}


