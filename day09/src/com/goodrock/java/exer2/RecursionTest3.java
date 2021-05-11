package src.com.goodrock.java.exer2;

public class RecursionTest3 {
    public static void main(String[] args) {
        RecursionTest3 test = new RecursionTest3();
        for (int i = 0; i < 10; i++){
            System.out.println("f(" + (i+1) + ") = " + test.fibo(i+1));
        }
    }
    public int fibo(int n){
        if(n == 1 || n == 2){
            return 1;
        }else{
            return fibo(n-1) + fibo(n-2);
        }
    }
}
