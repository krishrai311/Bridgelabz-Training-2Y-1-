package src.Recursion.String;

import java.util.*;
public class Palin {
    public static boolean palain(String s,int i){
        if(i==s.length()){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1))
        {
            return false;
        }
        return palain(s,i+1);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(palain(s,0));
    }
}

