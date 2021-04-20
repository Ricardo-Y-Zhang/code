package cn.zy.exer;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{35, 58, 89, 36, 38, 44, 19, -8, 0, 20};

        //冒泡排序
        for(int i = 0; i < arr.length - 1; i++){//arr.length-1轮排序
            for(int j = 0; j <  arr.length - i - 1; j++){//一轮排序
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        //输出
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
