package src.Recursion;

import java.util.Scanner;
    public class GCD {
        public static int gcd(int x,int y) {
            if(y%x==0){
                return x;
            }
            return gcd(y%x,x);
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(gcd(x,y));
        }
    }
