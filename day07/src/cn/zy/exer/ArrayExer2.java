package cn.zy.exer;


public class ArrayExer2 {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new int[i+1];
            for(int j = 0; j < arr[i].length; j++){
                if(j == 0 || j == arr[i].length-1){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
