package Recursion;

import java.util.Scanner;

public class Recursion1905 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(sum(k));
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }else{
            return n+sum(n-1);
        }
    }
}




