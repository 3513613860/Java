import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int pos = 1;
            int curSum = 0;
            getSum(list,pos,curSum,n,m);
        }
    }
    
    public static void getSum(ArrayList<Integer> list,int pos,int curSum,int n,int m){
        if(curSum >= m){
            if(curSum == m){
                for(int i = 0; i < list.size()-1; i++){
                    System.out.print(list.get(i)+" ");
                }
                System.out.println(list.get(list.size()-1));
            }
            
            return;
        }
        for(int i = pos;i <= n; i++){
            list.add(i);
            getSum(list,i+1,curSum+i,n,m);
            list.remove(list.size()-1);
        }
    }
}