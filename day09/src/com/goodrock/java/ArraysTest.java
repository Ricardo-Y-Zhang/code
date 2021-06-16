package com.goodrock.java;

public class ArraysTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();

        int[] arr = new int[]{45, 23, 10, 34, 55, 43, 19, 100, 98, 87, 99, 92};

        //遍历数组
        util.info(arr);

        System.out.println("最大值为：" + util.getMax(arr));

        System.out.println("最小值为：" + util.getMin(arr));

        System.out.println("平均值为：" + util.getAvg(arr));

        System.out.println("总和为："+ util.getAvg(arr));

        //复制数组
        int[] copyarr = util.copy(arr);

        util.info(copyarr);

        //数组排序
        util.sort(arr);

        util.info(arr);

        //反转数组
        util.reverse(arr);

        util.info(arr);

        System.out.println("45在arr中第" + util.find(arr, 45) + "个");


        //方法重载
        double[] dbarr = new double[]{1.0, 0.9, 18.9, 8.7, 10.5, 16.5, -18.4, 14.5, 12.5};

        util.info(dbarr);

        System.out.println("最大值为：" + util.getMax(dbarr));
    }
}
