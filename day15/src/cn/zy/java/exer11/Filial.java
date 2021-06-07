package src.cn.zy.java.exer11;

public interface Filial {

    //默认方法
    default void help(){
        System.out.println("老妈，我来救你了");
    }
}
