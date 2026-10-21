package src.Recursion.String;

import java.util.*;
public class substring {
    public static void basic(String name,int i){
        if(i==name.length()){
            return;
        }
        System.out.println(name.substring(3,5));
        return;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        basic(name,0);
    }
}

