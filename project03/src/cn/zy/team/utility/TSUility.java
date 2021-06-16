package cn.zy.team.utility;

import java.util.Scanner;

/**
 * @program: code
 * @description: 键盘访问
 * @author: Mr.Yan
 * @create: 2021-06-11 11:22
 **/
public class TSUility {
    private static Scanner scanner = new Scanner(System.in);



    private static String readKeyBoard(int limit, boolean blankReturn){
        String line = "";

        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            if(line.length() == 0){
                if(blankReturn){
                    return line;
                }else{
                    continue;
                }
            }

            if(line.length() < 1 || line.length() > limit){
                System.out.print("输入长度（不大于" + limit + "）错误，请重新输入：");
                continue;
            }
            break;
        }
        return line;
    }

    /**
     * description: 读取键盘，如果键入1-4中任意子父，则方法返回。返回值未用户键入字符
     * @param
     * @return  char
     * @author: Mr.Yan
     * @date: 2021/6/11
     **/
    public static char readMenuSelection(){
        char c;
        Label: for(;;){
            String str = readKeyBoard(1, false);

            c = str.charAt(0);

            switch (c){
                case '1':
                case '2':
                case '3':
                case '4':
                    break Label;
                default:
                    System.out.print("输入错误，请重新输入：");
            }
        }
        return c;
    }

    /**
     * description: 该方法提示并等待，直到用户按回车键后返回
     * @param
     * @return  void
     * @author: Mr.Yan
     * @date: 2021/6/11
     **/
    public static void readReturn(){
        System.out.print("按回车键继续...");
        readKeyBoard(100, true);
    }


    /**
     * description: 从键盘读取长度不超过两位的整数，作为方法的返回值
     * @param
     * @return  int
     * @author: Mr.Yan
     * @date: 2021/6/11
     **/
    public static int readInt(){
        int n;
        for(;;){
            String str = readKeyBoard(2, false);

            //格式异常，输入可能不是数字
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("数字输入错误，请重新输入：");
            }
        }
        return n;
    }


    /**
     * description: 从键盘读取'Y'或'N'， 并将其作为方法的返回值
     * @param
     * @return  char
     * @author: Mr.Yan
     * @date: 2021/6/11
     **/
    public static char readConfirmSelection(){
        char c;

        for(;;){
            String str = readKeyBoard(1, false).toUpperCase();

            c = str.charAt(0);

            if(c == 'Y' || c == 'N'){
                break;
            }else{
                System.out.print("选择错误，请重新输入：");
            }
        }

        return c;
    }








}

