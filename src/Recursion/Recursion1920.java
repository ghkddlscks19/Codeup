package Recursion;

import java.util.Scanner;

public class Recursion1920 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        digit(k);
    }

    public static int digit(int n) {
        if (n <= 1) {
            System.out.print(n);
            return n;
        }else{
            digit(n/2);
            System.out.print(n%2);
            return 0;
        }

    }
}
