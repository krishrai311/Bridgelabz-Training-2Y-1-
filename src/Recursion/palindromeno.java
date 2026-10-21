package src.Recursion;

import java.util.Scanner;
public class palindromeno {
    public static int rev(int n,int reverse){
        //Base Case
        if(n==0){
            return reverse;
        }
        int rem=n%10;
        reverse=reverse*10+rem;
        return rev(n/10,reverse);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(rev(n,0)==n){
            System.out.print("Yes");
        }
        else{
            System.out.print("Not ");
        }

    }
}


