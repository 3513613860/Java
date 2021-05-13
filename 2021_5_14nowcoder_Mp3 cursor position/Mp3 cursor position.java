import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n =sc.nextInt();
            String str = sc.next();
           if(n <= 4){
                int temp = 1;
                char [] chars = str.toCharArray();


                for(int i = 0; i < chars.length; i++){
                    if(temp == 1 && chars[i] == 'U'){
                        temp = n;
                    }
                    if(temp == n && chars[i] == 'D'){
                        temp = 1;
                    }
                  if(temp == n && chars[i] == 'U'){
                        temp--;
                    }

                    if(temp == 1 && chars[i] == 'D'){
                        temp++;
                    }                    
                    if(temp > 1 && temp < n){
                        if(chars[i] == 'U'){
                            temp = temp--;
                        }else{
                            temp = temp++;
                        }
                    }
                }

                for(int i = 1; i <= n; i++){
                    System.out.print(i+" ");
                }
                System.out.println();
                System.out.println(temp);
            }else{
                int temp = 1;
                char [] chars = str.toCharArray();

                int j = 1;
                int k = 4;
                for(int i = 0; i < chars.length; i++){
                    if(temp == 1 && chars[i] == 'U'){
                        temp = n;
                        j = n-3;
                        k = n;
                        continue;
                    }
                    if(temp == n && chars[i] == 'D'){
                        temp = 1;
                        j = 1;
                        k = 4;
                        continue;
                    }

                        if(temp != 1 && chars[i] == 'U'){

                            if(temp == j){
                                j--;
                                k--;
                            }
                            temp--;
                            continue;
                        }
                        if(temp != n && chars[i] == 'D'){

                            if(temp == k){
                                j++;
                                k++;
                            }
                            temp++;
                            continue;
                        }

                }
                for(int i = j; i <= k; i++){
                    System.out.print(i+" ");
                }
                System.out.println();
                System.out.println(temp);

            }
        }
    }
}