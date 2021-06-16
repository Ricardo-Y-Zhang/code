package cn.zy.java;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,7,9,11,18,20,33,45,99};
        int head = 0, end = arr.length-1;
        int target = 20;
        while(head <= end){
            int mid = (head + end)/2;
            if(arr[mid] == target){
                head = mid;
                break;
            }else if (arr[mid] < target){
                head = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        System.out.println(arr[head]);
    }
}
