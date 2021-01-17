class Solution {
    public int countPrimeSetBits(int L, int R) {
      int count = 0;
      while(L <= R){
          int sum = 0;
          int m = L;
          //计算二进制中1的个数
          while(m != 0){
              m = m & (m - 1);
              sum++;
          }
          int s = 0;
          //判断是否是质数
          for(int i = 2;i < sum; i++){
              if(sum % i == 0){
                  s++;
              }
          }
          if(s == 0 && sum != 1){
              count++;
          }
          L++;
      }
      return count;  
    }    
}