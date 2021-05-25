package src.cn.goodrock.java.exer2;

/**
 * @program: code
 * @description: 子类，继承ManKind
 * @author: Mr.Yan
 * @create: 2021-05-20 17:29
 **/
public class Kids extends ManKind{
    private int yearsOld;


    public Kids(){}
    public Kids(int yearsOld){
        this.yearsOld = yearsOld;
    }

    /**
     * description: 打印年龄
     * @param
     * @return  void
     * @author: Mr.Yan
     * @date: 2021/5/20
     **/
    public void printAge(){
        System.out.println("Age: " + yearsOld);
    }


    public int getYearsOld(){
        return yearsOld;
    }

    public void setYearsOld(int yearsOld){
        this.yearsOld = yearsOld;
    }


}
