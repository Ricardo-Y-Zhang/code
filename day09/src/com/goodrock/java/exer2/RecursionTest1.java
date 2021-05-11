package src.com.goodrock.java.exer2;

public class RecursionTest1 {
    public static void main(String[] args) {
        RecursionTest1 test = new RecursionTest1();

        System.out.println("1+...+10 = " + test.getSum(10));
    }
    public int getSum(int n){
        if(n == 1){//递归边界
            return 1;
        }else{
            return n + getSum(n-1);//递归
        }
    }
}
