class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int [][] arr = new int [numRows][numRows];
        for(int i = 0; i < numRows; i++){
            List<Integer> subList = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == numRows-1){
                    arr[i][j] = 1;
                }else{
                    int k = arr[i-1][j-1]+arr[i-1][j];
                    arr[i][j] = k;
                }
                subList.add(arr[i][j]);
            }
            list.add(subList);
        }
        return list;

    }
}