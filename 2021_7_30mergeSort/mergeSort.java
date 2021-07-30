package basic_sort.second;

import java.util.Arrays;

public class Demo07MergeSort {
    public static void main(String[] args) {
        int [] nums = {80,30,60,40,20,10,50,70};
        int [] array = new int [nums.length];
        System.out.println("排序前：");
        System.out.println(Arrays.toString(nums));

        mergeSort(nums,0,nums.length-1,array);

        System.out.println("排序后");
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int [] nums,int low,int high,int [] array){
        if(low < high){
            int mid = low+(high-low)/2;
            mergeSort(nums,low,mid,array);
            mergeSort(nums,mid+1,high,array);
            merge(nums,low,mid,high,array);
        }
    }

    public static void merge(int [] nums,int low,int mid,int high,int [] array){
        int s1 = low;
        int e1 = mid;
        int s2 = mid+1;
        int e2 = high;
        int k = low;
        while(s1 <= e1 && s2 <= e2){
            if(nums[s1] < nums[s2]){
                array[k++] = nums[s1++];
            }else{
                array[k++] = nums[s2++];
            }
        }

        while(s1 <= e1){
            array[k++] = nums[s1++];
        }

        while(s2 <= e2){
            array[k++] = nums[s2++];
        }
        for(int i = low; i <= high; i++){
            nums[i] = array[i];
        }
    }
}
