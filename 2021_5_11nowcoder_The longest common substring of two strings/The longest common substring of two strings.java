import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            if(str1.length() > str2.length()){
                String str = str1;
                str1 = str2;
                str2 = str;
            }
            int m = str1.length();
            int n = str2.length();
            int [][] nums = new int [m+1][n+1];
            
            int max = 0;
            String str = "";
            
            for(int i = 1; i <= m; i++){
                for(int j = 1; j <= n; j++){
                    if(str1.charAt(i-1) == str2.charAt(j-1)){
                        nums[i][j] = nums[i-1][j-1]+1;
                        if(nums[i][j] > max){
                            max = nums[i][j];
                            str = str2.substring(j-max,j);
                        }
                    }
                }
            }
            System.out.println(str);
        }
    }
}