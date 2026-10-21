package src.Recursion;

import java.util.Scanner;
public class Armstrong {
    public static int arm(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem*rem*rem+arm(n/10);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(arm(n)==n){
            System.out.print("Yes");
        }
        else{
            System.out.print("Ni");
        }
    }
}

