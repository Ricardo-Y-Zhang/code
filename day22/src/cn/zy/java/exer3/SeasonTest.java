package cn.zy.java.exer3;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-29 15:58
 **/
public class SeasonTest {
    public static void main(String[] args) {
        Season[] values = Season.values();
        for (int i = 0; i < values.length; i++) {
            values[i].show();
        }
    }
}

interface info{
    public abstract void show();
}

enum Season implements info{

    //1. 提供当前枚举类的对象，多个对象间用","隔开，末尾用";"结束
    SPRING ("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("宁夏");
        }
    },
    AUTUMN("秋天", "秋高气爽") {
        @Override
        public void show() {
            System.out.println("秋天是用来分手的季节");
        }
    },
    WINTER("冬天", "冬虫夏草") {
        @Override
        public void show() {
            System.out.println("大约在冬季");
        }
    };

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

//    @Override
//    public void show() {
//        System.out.println("这是一个season");
//    }
}