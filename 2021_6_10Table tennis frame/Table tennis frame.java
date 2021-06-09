import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.next();
            String str2 = sc.next();
            Map<Character,Integer> map1 = new HashMap<>();
            Map<Character,Integer> map2 = new HashMap<>();
            for(int i = 0; i < str1.length(); i++){
                char c = str1.charAt(i);
                if(map1.containsKey(c)){
                    int t = map1.get(c);
                    map1.put(c,t+1);
                }else{
                    map1.put(c,1);
                }
            }

            for(int i = 0; i < str2.length(); i++){
                char c = str2.charAt(i);
                if(map2.containsKey(c)){
                    int t = map2.get(c);
                    map2.put(c,t+1);
                }else{
                    map2.put(c,1);
                }
            }

            boolean flag = false;
            for(int i = 0; i < str2.length(); i++){
                char c = str2.charAt(i);
                int k = map2.get(c);
                if(!map1.containsKey(c)){
                    System.out.println("No");
                    flag = true;
                    break;
                }
                if(map1.get(c) < k){
                    System.out.println("No");
                    flag = true;                    
                    break;
                }
            }
            
            if(flag == false){
                 System.out.println("Yes");
            }
           
        }
    }
}