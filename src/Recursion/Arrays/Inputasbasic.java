package src.Recursion.Arrays;

import java.util.*;
public class Inputasbasic {
    public static void sum(int arr[],int i){
        if(i==arr.length){
            return;
        }
        sum(arr,i+1);
        System.out.print(arr[i]+" ");

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

