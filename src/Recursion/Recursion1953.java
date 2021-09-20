package Recursion;

import java.util.Scanner;

public class Recursion1953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        triangle(0,1,n);
    }
    public static void triangle(int s, int e, int n){
        if(s == n){
            return;
        }else{
            if(s == e){
                e+=1;
                s = 0;
                System.out.println();
            }
            System.out.print("*");
            triangle(s+1,e,n);
        }
    }
}
