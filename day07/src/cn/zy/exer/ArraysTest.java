package cn.zy.exer;

import java.util.Arrays;//操作数组的工具类

public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{23, 45, 19, 8, 4, 98, 76, 34, -10, -23, -9};
        int[] arr2 = new int[]{23, 45, 19, 8, 4, 98, 76, 34, -10, -23, -8};

        //boolean equals(int[] a, int[] b)
        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals);

        //String toString(int[] a)
        System.out.println(Arrays.toString(arr1));


        //sort(int[] a)
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));



        //fill(int[] a, int value)
        Arrays.fill(arr1, 0);
        System.out.println(Arrays.toString(arr1));


        //binarySearch(int[] a. int key)
        Arrays.sort(arr2);
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println(Arrays.binarySearch(arr2, 8));


    }
}
