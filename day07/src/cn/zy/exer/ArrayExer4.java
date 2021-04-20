package cn.zy.exer;

public class ArrayExer4 {
    public static void main(String[] args){
        int[] arr1, arr2;
        arr1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};

        //打印arr1
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();

        //赋值arr2等于arr1
        arr2 = arr1;

        //修改arr2
        for(int i = 0; i < arr2.length; i++){
            if(i % 2 == 1){
                arr2[i] = i + 1;
            }
        }

        //打印arr1
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + "\t");
        }
    }
}
