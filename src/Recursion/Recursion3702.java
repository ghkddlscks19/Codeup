package Recursion;

import java.util.Scanner;

public class Recursion3702 {
    static int arr[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        arr = new int[51][51];
        System.out.println(pascal(r,c));
    }
    public static int pascal(int r, int c){
        if(r==1 || c==1){
            return 1;
        }else if(arr[r][c] != 0){
            return arr[r][c];
        }else{
            return arr[r][c] = arr[c][r] = (pascal(r,c-1) + pascal(r-1,c)) % 100000000;
        }
    }
}
