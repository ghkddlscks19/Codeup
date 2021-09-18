package Recursion;

import java.util.Scanner;

public class Recursion1915 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(pibonacci(k));
    }
    public static int pibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return pibonacci(n-1) + pibonacci(n-2);
        }
    }
}
