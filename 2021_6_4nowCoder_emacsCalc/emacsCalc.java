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

            Stack<Integer> stack = new Stack();
            int ret = 0;
            for(int i= 0; i < n; i++){
                if(!strings[i].equals("+") && !strings[i].equals("-")&& !strings[i].equals("*") && !strings[i].equals("/")){
                    int cur = Integer.parseInt(strings[i]);
                    stack.push(cur);
                }else{
                    int a = stack.pop();
                    int b = stack.pop();
                    if(strings[i].equals("+")){
                        ret = b + a;
                    }else if(strings[i].equals("-")){
                        ret = b - a;
                    }else if(strings[i].equals("*")){
                        ret = b * a;
                    }else{
                        ret = b / a;
                    }
                    stack.push(ret);
                }
            }
            System.out.println(stack.pop());
        }
    }
}