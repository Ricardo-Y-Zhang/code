package cn.zy.exer4;


public class Girl {
    private String name;
    private int age;

    public Girl(){

    }

    public Girl(String name){
        this.name = name;
    }
    public Girl(String name, int age){
        this.name = name;
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void marry(Boy boy){
        System.out.println("我要嫁给" + boy.getName());
        //this指代girl
        boy.marry(this);
    }


    /**
    * @Description: 对象的比较
    * @Param: [girl]
    * @return: void;正数：当前对象大；负数：当前对象小；0：当前对象和形参对象一致
    * @Author: Mr.Wang
    * @Date: 2021/5/17
    */
    public int compare(Girl girl){
        if(this.age < girl.age){
            return -1;
        }else if(this.age > girl.age){
            return 1;
        }else{
            return 0;
        }
    }
}
