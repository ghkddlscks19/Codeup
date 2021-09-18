package Recursion;

import java.util.Scanner;

public class Recursion1902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        num(k);
    }
    public static int num(int n){
        if(n == 1){
            System.out.println(n);
            return 1;
        }else{
            System.out.println(n);
            return num(n-1);
        }
    }
}
