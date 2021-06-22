package cn.zy.java.exer1;

import java.util.Arrays;

/**
 * @program: code
 * @description: 字符串排序
 * @author: Mr.Yan
 * @create: 2021-06-22 15:48
 **/
public class Test4 {
    public static void main(String[] args) {
        String str = "jlkajyiuknlmrlqbbaaa";

        System.out.println(stringSort(str));
    }

    public static String stringSort(String str){
        char[] chars = str.toCharArray();

        //Arrays.sort(chars);

        for (int i = 0; i < chars.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < chars.length - 1 - i; j++) {
                if(chars[j] > chars[j + 1]){
                    char temp = chars[j + 1];
                    chars[j + 1] = chars[j];
                    chars[j] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }

        return new String(chars);
    }
}
