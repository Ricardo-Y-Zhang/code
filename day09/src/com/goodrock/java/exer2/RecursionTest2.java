package src.com.goodrock.java.exer2;

public class RecursionTest2 {
    public static void main(String[] args) {
        RecursionTest2 test = new RecursionTest2();

        System.out.println("f(10) = " + test.getF(10));
    }
    public int getF(int n){
        if(n == 0){//递归边界
            return 1;
        }else if (n == 1){//递归边界
            return 4;
        }else{
            return 2 * getF(n-1) + getF(n-2);
        }
    }
}
