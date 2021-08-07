package basic_sort.third;

import java.util.ArrayList;
import java.util.List;

public class Demo08 {
    static int temp = 0;
    static List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {

        int [][] nums = {{1,0,7},{2,0,6},{3,4,5},{0,3,0},{9,0,20}};

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                if(nums[i][j] != 0){
                    boolean [][] flag = new boolean[nums.length][nums[0].length];
                    dfs(i,j,nums,flag);
                }
            }
        }
        int max = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        System.out.println(max);
    }

    public static void dfs(int x, int y, int[][] nums,boolean [][] flag){
        if(x < 0 || x >= nums.length || y < 0 || y >= nums[0].length || flag[x][y] == true || nums[x][y] == 0){
            list.add(temp);
            return;
        }

        temp += nums[x][y];
        flag[x][y] = true;
        dfs(x,y+1,nums,flag);
        dfs(x,y-1,nums,flag);
        dfs(x+1,y,nums,flag);
        dfs(x-1,y,nums,flag);
        flag[x][y] = false;
        temp -= nums[x][y];
    }
}
