package src.cn.goodrock.java.exer2;

import java.lang.invoke.SerializedLambda;

/**
 * @program: code
 * @description: 父类
 * @author: Mr.Yan
 * @create: 2021-05-20 17:24
 **/
public class ManKind {
    private int sex;
    private int salary;

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    /**
     * description: 根据sex判断性别
     * @param
     * @return  void
     * @author: Mr.Yan
     * @date: 2021/5/20
     **/
    public void manOrWoman(){
        if(sex == 1){
            System.out.println("性别：男");
        }else{
            System.out.println("性别：女");
        }
    }


    /**
     * description: 根据salary显示是否有工作
     * @param
     * @return  void
     * @author: Mr.Yan
     * @date: 2021/5/20
     **/
    public void employeed(){
//        if(salary == 0){
//            System.out.println("no job");
//        }else{
//            System.out.println("job");
//        }
        String jobInfo = (salary == 0) ? "no job" : "job";
        System.out.println(jobInfo);
    }

    public int getSex() {
        return sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
