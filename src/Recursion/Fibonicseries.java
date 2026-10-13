package src.Recursion;
import java.util.Scanner;
public class Fibonicseries{
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }

        int sum=fact(n-1)+fact(n-2);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=fact(n);
        System.out.print(a);
    }
}
