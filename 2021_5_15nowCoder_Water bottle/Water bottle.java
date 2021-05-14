import java.util.*;
public class Main{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNextInt()){
        int count = sc.nextInt();
        int ret = 0;
        if(count == 0 || count == 1){
            continue;
        }
        while(count >= 3){
            ret += count/3;
            count = count / 3+count % 3;
        }
        if(count == 2){
            ret++;
        }
        System.out.println(ret);
        }
    }
}