package src.Recursion;

import java.util.Scanner;
public class Leapyear {
    public static void year(int n){
        if(n<=0){
            System.out.println("Invalid its");
            return ;
        }
        if((n%4==0 && n%100!=0) || (n%400==0)){
            System.out.print("Leap");
        }
        else{
            System.out.print("Not leap");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        year(n);
    }
}
