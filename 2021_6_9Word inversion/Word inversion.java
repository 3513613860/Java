import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            String [] strings = new String[str.length()];
            int k = 0;

            int i = 0;
            while(i < str.length()){
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' &&
                        str.charAt(i) <= 'Z'){
                    String s = "";
                    while(i < str.length() &&  (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' &&
                            str.charAt(i) <= 'Z')){
                        s = s + str.charAt(i);
                        i++;
                    }
                    strings[k++] = s;
                }else{
                    while(i < str.length() && (str.charAt(i) < 'A' || str.charAt(i) > 'Z' &&
                            str.charAt(i) < 'a' || str.charAt(i) > 'z')){
                        i++;
                    }
                }
            }

            for(int j = k-1; j >= 0; j--){
                if(j != 0){
                    System.out.print(strings[j]+' ');
                }else{
                    System.out.print(strings[j]);
                }
            }
            System.out.println();
        }
    }
}