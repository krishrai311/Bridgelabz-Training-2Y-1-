package src.Recursion;

import java.util.Scanner;
public class Sumofdigit {
    public static int fact(int n){
        if(n<10){
            return n;
        }

        int a=n%10;
        int b=fact(n/10);
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fact(n));
    }
}

