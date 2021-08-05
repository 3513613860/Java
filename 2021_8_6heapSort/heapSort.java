package basic_sort.first;

import java.util.Arrays;

public class Demo06HeapSort {
    public static void main(String[] args) {
        int [] nums = {4,8,3,1,2,7,9,5};
        System.out.println("排序前");
       // System.out.println(Arrays.toString(nums));
        System.out.println("排序后");
        heapSort(nums);
       // System.out.println(Arrays.toString(nums));
    }

    private static void heapSort(int[] nums) {
        //1.构建大根堆
        for(int i = nums.length/2-1; i >= 0; i--){
            adjust(nums,i,nums.length);
            System.out.println(Arrays.toString(nums));
        }
        System.out.println();

        //2.调整堆
        for(int j = nums.length-1; j >0; j--){
            swap(nums,0,j);
            System.out.println(Arrays.toString(nums));
            adjust(nums,0,j);
        }
    }

    private static void adjust(int [] nums,int i,int length){
        int parent = i;
        int child = 2 * i + 1;
        while (child < length){
            if(child+1 < length && nums[child] < nums[child+1]){
                child++;
            }

            if(nums[parent] < nums[child]){
                  swap(nums,child,parent);
                  parent = child;
            }else{
                break;
            }
            child = child * 2 + 1;
        }
    }

    private static void swap(int [] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
