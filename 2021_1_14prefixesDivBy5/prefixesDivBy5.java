class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        // //创建集合对象
        // List<Boolean> list = new ArrayList<>();
        // int sum = 0;
        // int i = 0;
        // //数组前面为0时，为false
        // if(i == 0 && A[i] == 0){
        //     while(A[i] == 0){
        //         list.add(true);
        //         i++;
        //     }
        // }
        // //当出现第一个1时，为flase，记录sum为1
        // if(A[i] == 1){
        //     sum = 1;
        //     i++;
        // }
        // list.add(false);        
        // for(; i < A.length; i++){
        //     //出现1时，乘以2加1
        //     if(A[i] == 1){
        //         sum = sum * 2 + 1;
        //     }
        //     //出现0时，乘以2
        //     if(A[i] == 0){
        //         sum = sum * 2;
        //     }
        //     //能被5整除，为true，否则为false
        //     list.add(sum % 5 == 0);
        //     //sum变为sum除以5的余数
        //     sum = sum % 5;
        // }
        // return list;


        //创建集合对象
        List<Boolean> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < A.length; i++){
            sum = sum << 1;
            sum += A[i];
            sum = sum % 10;
            list.add(sum == 0 || sum == 5);
        }
        return list;
    }
}