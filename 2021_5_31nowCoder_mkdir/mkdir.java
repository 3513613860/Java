// write your code here
// write your code here
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String [] strings = new String[n];
            for(int i = 0; i < n; i++){
                strings[i] = sc.next();
            }
            
            Arrays.sort(strings);
            for(int i = 0; i < n; i++){
                while(i < n-1 && strings[i+1].contains(strings[i]+"/")){
                    i++;
                }
                System.out.println("mkdir -p "+strings[i]);
            }
            System.out.println();
        }
    }
}