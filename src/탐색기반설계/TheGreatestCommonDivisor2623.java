package 탐색기반설계;

import java.util.Scanner;

public class TheGreatestCommonDivisor2623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }else{
            return gcd(b,a%b);
        }
    }
}
