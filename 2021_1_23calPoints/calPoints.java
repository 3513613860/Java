class Solution {
    public int calPoints(String[] ops) {
        //定义一个整形数组
        int [] arr = new int[ops.length];
        int k = 0;
        //遍历字符串，分情况存元素
        for(int i = 0; i < ops.length; i++){
            if("+".equals(ops[i])){
                arr[k] = arr[k-1]+arr[k-2];
                k++;
            }
            else if("C".equals(ops[i])){
                k--;
            }
            else if("D".equals(ops[i])){
                arr[k] = 2 * arr[k-1];
                k++;
            } else{
                Integer a = Integer.valueOf(ops[i]);
                arr[k++] = a;
            }
        }

        //进行累加
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        return sum;
    }
}