// write your code here
// write your code here
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            int n = Integer.parseInt(s);
            
            String [] string = new String[n];
            for(int i = 0; i < n; i++){
                string[i] = sc.nextLine();
            }
            
            String ret = "";
            for(int i = 0; i < n; i++){
                
                String cur = string[i];
                int flag = 0;
                for(int j = 0; j < cur.length(); j++){
                    if(cur.charAt(j) == ' ' || cur.charAt(j) == ','){
                        flag = 1;
                        break;
                    }
                }
                if(i == n-1){
                    if(flag == 0){
                        ret = ret + cur;
                    }
                    if(flag ==1){
                        ret = ret +"\""+cur+"\"";
                    }
                    break;
                }
                
                if(flag == 0){
                    ret = ret + cur+", ";
                }else{
                    ret = ret +"\""+cur+"\""+", ";
                }
                
            }         
            System.out.println(ret);
        }
    }
}