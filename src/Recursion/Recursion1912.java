package Recursion;

import java.util.Scanner;

public class Recursion1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(factorial(k));
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
}
