package Recursion;

import java.util.Scanner;

public class Recursion1928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Collatz(k);
    }
    public static int Collatz(int n){
        if(n == 1){
            System.out.println(n);
            return 1;
        }else if(n%2 != 0){
            System.out.println(n);
            return Collatz(3*n+1);
        }else{
            System.out.println(n);
            return Collatz(n/2);
        }
    }
}
