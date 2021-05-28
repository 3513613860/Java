// write your code here
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            System.out.println(func(n));
        }
    }
    
    public static long func(int n){
        long [] nums = new long[91];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        for(int i = 3; i < 91; i++){
            nums[i] = nums[i-1]+nums[i-2];
        }
        return nums[n];
    }
}