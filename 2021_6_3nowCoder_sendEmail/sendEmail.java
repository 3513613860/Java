// write your code here
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        long [] nums = new long [21];
        nums[1] = 0;
        nums[2]  = 1;
        for(int i = 3; i < 21; i++){
            nums[i] = (i-1)*(nums[i-1]+nums[i-2]);
        }
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            System.out.println(nums[n]);
        }
    }
}