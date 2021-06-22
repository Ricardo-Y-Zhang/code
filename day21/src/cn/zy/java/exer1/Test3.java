package cn.zy.java.exer1;

/**
 * @program: code
 * @description: 获得两个字符串的最长子串
 * @author: Mr.Yan
 * @create: 2021-06-22 15:25
 **/
public class Test3 {

    public static void main(String[] args) {
        String str1 = "abkkcjkjaofjojaosfail";
        String str2 = "failkjdfaos";
        System.out.println(longgestSubString(str1, str2));
    }

    //将短的字符串进行长度依次递减的子串与较长的字符串比较
    public static String longgestSubString(String str1, String str2){
        String longString = (str1.length() > str2.length()) ? str1 : str2;
        String shortString = (str1.length() > str2.length()) ? str2 : str1;

        String str;

        for(int i = shortString.length(); i > 0; i--){//子串长度依次递减
            for(int j = 0; j <= shortString.length() - i; j++){//从左到右截取指定长度的子串
                str = shortString.substring(j, j+i);//截取子串

                //判断该子串是否为较长的字符串的子串
                int index = longString.indexOf(str);
                if(index != -1){
                    return str;
                }
            }
        }

        return "";
    }
}
