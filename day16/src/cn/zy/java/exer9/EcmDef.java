package cn.zy.java.exer9;

/**
 * @program: code
 * @description:
 * @author: Mr.Yan
 * @create: 2021-06-09 16:13
 **/
public class EcmDef {
    public static double ecm (double x, double y) throws EcDef{
        if(x < 0 || y < 0){
            //手动抛出异常
            throw new EcDef("输入负数");
        } else{
            return x / y;
        }
    }

    public static void main(String[] args){

        try{

            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);

            System.out.println(ecm(x, y));
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("除0");
        }catch (EcDef e){
            System.out.println(e.getMessage());
        }
    }
}

