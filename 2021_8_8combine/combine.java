package test2;

import java.util.ArrayList;
import java.util.List;

public class Test16 {
    static List<ArrayList<Integer>> list = new ArrayList<>();
    static List<Integer> subList = new ArrayList<>();

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        dfs(0,3,nums);
        System.out.println(list);
    }

    public static void dfs(int i, int k, int [] nums){
        if(subList.size() == k){
            list.add(new ArrayList<>(subList));
            return;
        }
        for(int j = i; j < nums.length ; j++){
            subList.add(nums[j]);
            dfs(j+1,k,nums);
            subList.remove(subList.size()-1);
        }
    }
}
