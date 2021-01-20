class Solution {
    public String thousandSeparator(int n) {
        // if(n < 1000){
        //     return String.valueOf(n);
        // }
        // String str = String.valueOf(n);
        // int m = str.length();
        // int k = m % 3;
        // int s = 0;
        // if(k != 0){
        //     s = m / 3 + 1;
        // }
        // else{
        //     s = m /3;
        // }
        // int j = 0;
        // String[]strings = new String[s];
        // for(int i = 0; i < s;i++){
        //     if(i==0 && k > 0){
        //         strings[i] = "";
        //         while(k>0){
        //             strings[i] =strings[i] +str.charAt(j);
        //             j++;
        //             k--;

        //         }
        //         strings[i] = strings[i]+".";
        //         i++;
        //     }
        //     if(i!=s-1){
        //         strings[i] = ""+str.charAt(j)+str.charAt(j+1)+str.charAt(j+2)+".";
        //         j = j + 3;
        //     }
        //      if(i==s-1){
        //          strings[i] = ""+str.charAt(j)+str.charAt(j+1)+str.charAt(j+2)+"";
        //      }
        // }
        // String b = "";
        // for(int i = 0 ; i < s;i++){
        //     String st = strings[i];
        //     b = b + st;
        // }
        // return b;
        
        
        //如果n小于1000，直接返回字符串
        if(n < 1000){
            return String.valueOf(n);
        }
        //创建一个StringBuilder对象
        StringBuilder s = new StringBuilder("");
        //将整数装换为字符串
        String str = String.valueOf(n);
        //将字符串转换为字符数组
        char [] arr = str.toCharArray();
        int m = arr.length;
        //获取第1个"."在哪个位置
        int k = m % 3;
        int i = 0;

        while(i < m){
            //前面插入
            if(i==0  &&k != 0){
                while(k > 0){
                    s = s.append(arr[i]);
                    k--;
                    i++;
                }
                s = s.append(".");
            }
            //中间插入
            int a = 3;
            if(i+3 < m){
                while(a > 0){
                    s.append(arr[i]);
                    i++;
                    a--;
                }
                s = s.append(".");
            }
            //最后插入
            a = 3;
            if(i+3==m){
                while(a > 0){
                    s.append(arr[i]);
                    i++;
                    a--;
                }
                break;
            }            
        }
        //调用StringBuilder的toString方法，转换为字符串
        return s.toString();
    }
}