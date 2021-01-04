package demo01;

import java.util.Scanner;

public class Demo06CheckPsw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "root";
        int i = 3;
        while(i > 0){
            System.out.println("请输入你的密码：");
            String s = sc.nextLine();
            if(s.equals(str)){
                System.out.println("密码正确！！！");
                return;
            }
            i--;
        }
        System.out.println("密码错误！！！");
    }
}
