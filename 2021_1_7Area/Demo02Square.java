package demo02;

import java.util.Scanner;

public class Demo02Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double s = Math.PI * n * n;
        System.out.printf("%.7f",s);
    }
}
