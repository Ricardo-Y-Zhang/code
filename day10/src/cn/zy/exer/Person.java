package cn.zy.exer;

public class Person {
    private int age;

    public void setAge(int x){
       if(x > 0 && x < 130){
           age = x;
       }else{
           throw new RuntimeException("传入数据异常");
       }
    }

    public int getAge(){
        return age;
    }
}
