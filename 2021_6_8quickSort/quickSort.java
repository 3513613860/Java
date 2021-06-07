package basic_sort;

import java.util.Arrays;

public class Demo02QuickSort {
    public static void main(String[] args) {
        int [] nums = {4,8,3,1,1,2,9,1};
        System.out.println(Arrays.toString(nums));
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int [] nums,int low,int high){
        if(low < high){
            int piv = pivot(nums,low,high);
            quickSort(nums,low,piv-1);
            quickSort(nums,piv+1,high);
        }
    }

    public static int pivot(int [] nums,int low ,int high){
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


    public static int quickSort2(int [] nums,int left ,int right){
        int key = nums[right];

        while(left < right)
        {
            while(left < right && nums[left] <= key)
            {
                ++left;
            }
            nums[right] = nums[left];

            while(left < right && nums[right] >= key)
            {
                --right;
            }
            nums[left] = nums[right];
        }

        nums[right] = key;
        return right;
    }
}
