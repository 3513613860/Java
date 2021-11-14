import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param array int整型一维数组
     * @return int整型一维数组
     */
    public int[] FindNumsAppearOnce (int[] array) {
        // write code here
//         int [] nums = new int[2];
//         int temp = 0;
//         for(int i = 0; i < array.length; i++){
//             temp ^= array[i];
//         }

//         int index = 0;
//         for(int i = 0; i < 32; i++){
//             if(((temp >> i)&1)==1){
//                 index = i;
//                 break;
//             }
//         }
//         List<Integer> list1 = new ArrayList<>();
//         List<Integer> list2 = new ArrayList<>();
//         for(int i = 0; i < array.length; i++){
//             if(((array[i]>>index)&1)==1){
//                 list1.add(array[i]);
//             }else{
//                 list2.add(array[i]);
//             }
//         }

//         int a = 0;
//         for(int i = 0; i < list1.size(); i++){
//             a ^= list1.get(i);
//         }
//         int b = 0;
//         for(int i = 0; i < list2.size(); i++){
//             b ^= list2.get(i);
//         }
//         nums[0]=a;
//         nums[1]=b;
//         Arrays.sort(nums);
//         return nums;

        int [] nums = new int [2];
        int j = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            map.put(array[i],map.getOrDefault(array[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                nums[j++] = entry.getKey();
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}