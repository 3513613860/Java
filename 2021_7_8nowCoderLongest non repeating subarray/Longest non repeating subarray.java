import java.util.*;


public class Solution {
    /**
     * 
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength (int[] arr) {
        // write code here
        Set<Integer> set = new HashSet<>();
        int ret = 0;
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }else{
                set.remove(arr[k]);
                i--;
                k++;
            }
            ret = Math.max(ret,set.size());
        }
        return ret;
    }
}