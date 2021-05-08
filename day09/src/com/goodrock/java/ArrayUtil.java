package src.com.goodrock.java;

/*
自定义数组的工具类
 */
public class ArrayUtil {
    //求数组最大值
    public int getMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //overload
    public double getMax(double[] arr){
        double max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    //求数组最小值
    public int getMin(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    //求数组总和
    public  int getSum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }


    //平均值
    public double getAvg(int[] arr){
        ArrayUtil array = new ArrayUtil();
        int sum = array.getSum(arr);
        double avg = (double) sum / arr.length;
        return avg;
    }


    //反转数组
    public void reverse(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length -i - 1] = temp;
        }
    }


    //遍历数组
    public void info(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //overload
    public void info(double[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //复制数组
    public int[] copy(int[] arr){
        int[] copyarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            copyarr[i] = arr[i];
        }
        return copyarr;
    }

    //排序
    public void sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


    //查找指定元素
    public int find(int[] arr, int x){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                index = i;
                break;
            }
        }
        return index;
    }
}
