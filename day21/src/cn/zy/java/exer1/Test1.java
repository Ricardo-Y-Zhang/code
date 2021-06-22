package cn.zy.java.exer1;

/**
 * @program: code
 * @description: 将一个字符串进行反转，指定部分反转
 * @author: Mr.Yan
 * @create: 2021-06-22 14:58
 **/
public class Test1 {
    public static String reverse(String str, int startIndex, int endIndex){

        if(str != null && str.length() != 0){
            char[] chars = str.toCharArray();

            for(int i = startIndex, j = endIndex; i < j; i++, j--){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
            }

            String s = new String(chars);
            return s;
        }
        return str;
    }

    public static String reverse1(String str, int startIndex, int endIndex){
        if(str != null){
            String strs = str.substring(0, startIndex);

            for (int i = endIndex; i >= startIndex; i--) {
                strs += str.charAt(i);
            }

            strs += str.substring(endIndex + 1);
            return strs;
        }
        return str;
    }



    public static void main(String[] args) {
        String str = new String("abcdefg");

        String str2 = reverse(str, 2, 4);

        System.out.println(str2);
    }
}
