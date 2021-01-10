class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        digits[n-1] = digits[n-1]+1;
        int m = 0;
        for(int i = n-1; i >= 0;i--){
            int k  = m + digits[i];
            digits[i] = (m+digits[i]) % 10;
            m = k /10;
        }
        if(m == 0){
            return digits;
        }else{
            int [] arr = new int[n+1];
            for(int i = 0; i < n+1;i++){
                if(i == 0){
                    arr[i] = 1;
                }else{
                    arr[i] = 0;
                }
            }
            return arr;
        }
    }
}