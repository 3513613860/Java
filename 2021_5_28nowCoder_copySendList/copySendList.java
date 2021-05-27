// write your code here
// write your code here
import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            Set<String> set = new HashSet();
            
            char [] chars = str1.toCharArray();
            String str = "";
            int i = 0;
            while(i < chars.length){
                if(chars[i] == '\"'){
                    str = "";
                    i++;
                    while(i < chars.length && chars[i] != '\"'){
                        str = str + chars[i];
                        i++;
                    }
                    i++;
                    set.add(str);
                }else if(chars[i] == ','){
                    i++;
                }else{
                    str = "";
                    while(i < chars.length &&  chars[i] != ','){
                        str = str + chars[i];
                        i++;
                    }
                    set.add(str);
                }
            }
            
            if(set.contains(str2)){
                System.out.println("Ignore");
            }else{
                System.out.println("Important!");
            }
        }
    }
}