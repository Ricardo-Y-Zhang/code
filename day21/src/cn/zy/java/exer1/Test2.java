package cn.zy.java.exer1;

/**
 * @program: code
 * @description: 获取一个字符串在另外一个字符串中出现的次数
 * @author: Mr.Yan
 * @create: 2021-06-22 15:10
 **/
public class Test2 {
    public static void main(String[] args) {
        String str1 = "abbbcccbbbbbbb";
        String str2 = "bb";
        System.out.println(frequency(str2, str1));
    }

    public static int frequency(String subString, String str){
        int mainlength = str.length();
        int sublength = subString.length();

        if(sublength > mainlength){
            return 0;
        }else{
            int index = str.indexOf(subString);
            int times = 0;
            if(index != -1){
                while(true) {
                    int startIndex = index + 1;
                    index = str.indexOf(subString, startIndex);
                    if (index == -1) {
                        break;
                    }
                    times++;
                }
            }
            return times;
        }
    }
}
