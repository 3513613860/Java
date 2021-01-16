class Solution {
    public String toHex(int num) {
        if(num == 0){
            return "0";
        }
        char [] arr = new char[8];
        int k = 0;
        for(int i = 31; i >= 0;){
            int m = 0;
            int n = 3;
            while(n >= 0){
                m = m + (int)Math.pow(2,n--)*((num >>i) & 1);
                i--;
            }
            if(m > 9){
                arr[k++] = (char)(m+87);
            }else {
                arr[k++] = (char) (m+48);
            }
        }
        String str = new String(arr);
        int t = 0;
        while(str.charAt(t) =='0'){
            t++;
        }
        int s = str.length() - t;
        char [] arr2 = new char[s];
        int c = 0;
        for(int i = t; i < str.length(); i++){
            arr2[c++] = arr[i];
        }
        String str2 = new String(arr2);
        return str2;
    }
}