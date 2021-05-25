// write your code here
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;
        int [] nums = new int [100001];
        nums[1] = 1;
        nums[2] = 2;
        
        for(int i = 3; i< 100001; i++){
            nums[i] = (nums[i-1]+nums[i-2])%1000000;
        }
        
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            System.out.println(nums[n]);
        }
    }
}