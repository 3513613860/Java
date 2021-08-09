package basic_sort.third;

import java.util.Arrays;
import java.util.Random;

public class Demo01QuickSort {
    static int size = 10000;

    public static void main(String[] args) {
        int [] nums = new int [size];
        for(int i = 0; i < size; i++){
            nums[i] = i;
        }
        //System.out.println(Arrays.toString(nums));
        long start = System.currentTimeMillis();

        quickSort(nums,0,size-1);
       // System.out.println(Arrays.toString(nums));
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    private static void quickSort(int[] nums, int low, int high) {
        if(low < high){
            int piv = pivot(nums,low,high);
            quickSort(nums,low,piv-1);
            quickSort(nums,piv+1,high);
        }
    }

    public static int pivot(int [] nums,int low,int high){
        int temp = nums[low];
        while(low < high){
            while(low < high && nums[high] >= temp){
                high--;
            }
            nums[low] = nums[high];
            while(low < high && nums[low] <= temp){
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }
}
