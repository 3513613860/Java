class Solution {
    public String reverseWords(String s) {
        //将字符串按空格进行分隔
        String [] strings = s.split(" ");
        String string = "";
        //遍历这个字符串数组
        for(int i = 0; i < strings.length; i++){
            //获取字符串
            String str = strings[i];
            //将字符串转换为字符数组
            char [] arr = str.toCharArray();
            int k = 0;
            int j = arr.length-1;
            //进行逆置
            while(k < j){
                char ch = arr[k];
                arr[k] = arr[j];
                arr[j] = ch;
                k++;
                j--;
            }
            strings[i] = new String(arr);
        }

        //遍历字符串数组，进行拼接
        for(int i = 0; i < strings.length; i++){
            if(i != strings.length-1){
                string = string+strings[i] +" ";
            }
            else{
                string = string+strings[i];
            }
        }
        return string;
    }
}