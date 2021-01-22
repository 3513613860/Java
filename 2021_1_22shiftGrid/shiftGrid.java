class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int s = m * n;
        int [] arr = new int[s];
        int c = 0;
        //将二维数组转换为一维数组
        for(int i = 0; i < grid.length; i++){
            for(int l = 0; l < grid[i].length; l++){
                arr[c++] = grid[i][l];
            }
        }
        if(k > s){
            k = k - s;
        }
        //进行交换
        while(k > 0){
            int j = s - 1;
            int temp = arr[j];
            for(int i = j-1; i >= 0; i--){
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
            k--;
        }
        //将一维数组转换为二维的
        List<List<Integer>> list = new ArrayList<>();
        int i = 0;
        while(i < arr.length){
            List<Integer> sublist = new ArrayList<>();
            int a = n;
            while(a > 0){
                sublist.add(arr[i]);
                i++;
                a--;
            }
            list.add(sublist);
        }
        return list;
    }
}