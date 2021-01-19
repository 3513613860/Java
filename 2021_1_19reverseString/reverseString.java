class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        //i<j时就进行反转
        while(i < j){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;
            j--;
        }
    }
}