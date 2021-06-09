// write your code here
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            String [] strings = str.split("_");
            StringBuffer sb = new StringBuffer();
            for(int i = 0; i < strings.length; i++){
                String cur = strings[i];
                if(i != 0){
                    cur = cur.replaceFirst(cur.charAt(0)+"",(char)(cur.charAt(0)-32)+"");                    
                }
                sb.append(cur);
            }
            System.out.println(sb.toString());
        }
    }
}