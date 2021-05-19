import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble()){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            
            double [] nums = new double [3];
            nums[0] = a;
            nums[1] = b;
            nums[2] = c;
            Arrays.sort(nums);
            if(nums[0]+nums[1] > nums[2]){
                System.out.println("Yes");
            }else{
                System.out.println("No");               
            }
        }
    }
}