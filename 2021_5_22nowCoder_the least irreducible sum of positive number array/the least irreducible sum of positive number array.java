import java.util.*;
public class Solution {
	/**
	 *	正数数组中的最小不可组成和
	 *	输入：正数数组arr
	 *	返回：正数数组中的最小不可组成和
	 */
	public int getFirstUnFormedNum(int[] arr) {
        if(arr.length == 1){
            return arr[0]+1;
        }
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int i = 0; i < arr.length; i++){
            int size = list.size();
            for(int j = 0; j < size; j++){
                List<Integer> subList = new ArrayList(list.get(j));
                subList.add(arr[i]);
                list.add(subList);
            }
        }

        int k = list.size()-1;
        int [] nums = new int [k];
        for(int i = 1; i < list.size(); i++){
            List<Integer> curList = list.get(i);
            int sum = 0;
            for(int j = 0; j < curList.size(); j++){
                sum += curList.get(j);
            }
            nums[i-1] = sum;
        }

        Arrays.sort(nums);

        int j = 0;
        for(int i = 1; i < k; i++){
            if(nums[i] != nums[i-1]){
                nums[j++] = nums[i-1];
            }
        }
        nums[j++] = nums[k-1];

        for(int i = 1; i < j; i++){
            if(nums[i] != nums[i-1]+1){
                return nums[i-1]+1;
            }
        }
        return nums[k-1]+1;
	}
}