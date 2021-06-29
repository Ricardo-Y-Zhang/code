package cn.zy.java.exer2;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-29 15:07
 **/
public class SeasonTest1 {
    public static void main(String[] args) {
        Season summer = Season.SUMMER;
        //toString()
        System.out.println(summer);//SUMMER

        System.out.println(Season.class.getSuperclass());//class java.lang.Enum

        //values()
        Season[] values = Season.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        //valueOf()：根据提供的字符串，返回枚举类中对象名是该字符串的对象
        Season winter = Season.valueOf("WINTER");

    }
}


enum Season{

    //1. 提供当前枚举类的对象，多个对象间用","隔开，末尾用";"结束
    SPRING ("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "冬虫夏草");

    //2. 声明season对象属性：private final 修饰
    private final String seasonName;
    private final String seasonDesc;

    //3. 私有化类的构造器，并给对象属性赋值
    private Season(String seasonName, String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4. 其他诉求：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

}