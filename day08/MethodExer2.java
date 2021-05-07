
public class MethodExer2 {
    public static void main(String[] args){
        MyDate my = new MyDate();
        my.year = 1997;
        my.month = 7;
        my.day = 18;

        MyDate myGf = new MyDate();
        myGf.year = 1996;
        myGf.month = 8;
        myGf.day = 22;

        MethodExer2  test = new MethodExer2();
        test.print(my);
        test.print(myGf);
    }

    //封装进方法
    public void print(MyDate date){
        System.out.println("生日：" + date.info());
    }
}


class MyDate{
    int year;
    int month;
    int day;

    public String info(){
        return year + "/" + month + "/" + day;
    }
}
