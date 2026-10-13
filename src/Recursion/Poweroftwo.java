package src.Recursion;

import java.util.Scanner;
public class Poweroftwo {
    public static boolean fact(int p){
        if(p<=0){
            return false;
        }
        if(p==1){
            return true;
        }
        if(p%2!=0){
            return false;
        }

        return fact(p/2);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        System.out.print(fact(p));
    }
}

