package Recursion;

import java.util.Scanner;

public class Recursion1916 {
    static long arr[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        arr = new long[k+1];
        System.out.println(piboMemoization(k));
    }
    public static long piboMemoization(int n){
        if(n<=1){
            return n;
        }else if(arr[n] != 0) {
            return arr[n];
        }else{
            return arr[n] = (piboMemoization(n-1) + piboMemoization(n-2)) % 10009;
        }
    }
}
