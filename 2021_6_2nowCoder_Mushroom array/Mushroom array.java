import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int [][] array = new int [n+1][m+1];
            double [][] nums = new double [n+1][m+1];
            int [][] arr = new int [k][2];
            
            for(int i = 0; i < k; i++){
                for(int j = 0; j <2; j++){
                    arr[i][j] = sc.nextInt();
                }
                array[arr[i][0]][arr[i][1]] = -1;
            }
            nums[1][1] = 1.0;
            
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    if(array[i][j] != -1){
                        if(i == 1 && j == 1){
                            continue;
                        }
                        if(i == n && j < m){
                            nums[i][j] = nums[i][j-1]+nums[i-1][j]/2;
                        }
                        if(i < n && j == m){
                            nums[i][j] = nums[i-1][j]+nums[i][j-1]/2;
                        }
                        if(i < n && j < m){
                            nums[i][j] = nums[i-1][j]/2+nums[i][j-1]/2;
                        }
                        if(i == n && j == m){
                            nums[i][j] = nums[i-1][j]+nums[i][j-1];
                        }
                    }
                }
            }
            System.out.printf("%3.2f\n",nums[n][m]);
        }
    }
}