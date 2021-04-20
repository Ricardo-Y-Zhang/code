package cn.zy.exer;

public class ArrayExer3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
        }
        int max = -1, min = 100, sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("max = " + max );
        System.out.println("min = " + min);
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum / 10.0);
    }
}
