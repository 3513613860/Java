// write your code here
// write your code here
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int temp = n;
            List<Integer> list = new ArrayList<>();
     
            for(int i = 2; i <= (int)Math.sqrt(n); i++){
                while(n != i){
                    if(n % i == 0){
                        list.add(i);
                        n = n / i;
                    }else{
                        break;
                    }                    
                }
            }
            
            int size = list.size();
            if(size == 0){
                System.out.println(temp+" = "+temp);
                continue;
            }
            
            System.out.print(temp+" = ");
            for(int i = 0; i < list.size(); i++){
                System.out.print(list.get(i)+" * ");
            }
            System.out.print(n);
            System.out.println();
        }
    }
}