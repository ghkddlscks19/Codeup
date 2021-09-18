package Recursion;

import java.util.Scanner;

public class Recursiont1904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int j = sc.nextInt();
        num(k,j);
    }
    public static int num(int k, int j){
        if(k%2 ==0){
            return num(k+1,j);
        }else if(k<=j){
            System.out.println(k);
            return num(k+1,j);
        }
        return 0;
    }
}
