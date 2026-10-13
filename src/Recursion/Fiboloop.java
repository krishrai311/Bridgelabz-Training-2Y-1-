package src.Recursion;

import java.util.Scanner;
public class Fiboloop{
    public static int fact(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int sum=fact(n-1)+fact(n-2);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fact(i)+ " ");
        }
    }
}

