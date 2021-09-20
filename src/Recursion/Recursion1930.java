package Recursion;

import java.util.Scanner;

public class Recursion1930 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(SuperSum(k,n));
        }
    }
    public static int SuperSum(int k, int n){
        int sum = 0;
        if(k == 0){
            return n;
        }else{
            for(int i=1; i<=n; i++){
                sum += SuperSum(k-1,i);
            }
        }
        return sum;
    }
}
