package demo01;

import java.util.Scanner;

public class Demo03Fac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = fac(n);
        System.out.println(m);
    }

    public static int fac(int n){
        int sum = 0;
        int k = 1;
        for (int i = 1; i <= n; i++) {
            k = 1;
            for(int j = 1; j <= i; j++){
                k = k * j;
            }
            sum = sum + k;
        }
        return sum;
    }
}
