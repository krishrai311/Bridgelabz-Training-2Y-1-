package src.Recursion.Arrays;

import java.util.*;
public class Even {
    public static void sum(int arr[],int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]%2==0){
            System.out.print(arr[i]+" ");
        }
        sum(arr,i+1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sum(arr,0);
    }
}
