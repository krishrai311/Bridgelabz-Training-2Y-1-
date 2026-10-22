package src.Recursion.advanceRecursion;

import java.util.*;

public class Subsequence {
    public static ArrayList<String> ss(String str){
        ArrayList<String> ans=new ArrayList<>();
        if(str.length()==0){
            ans.add("");
            return ans;
        }
        char ch=str.charAt(0);
        ArrayList<String> small=ss(str.substring(1));
        for(String s:small){
            ans.add(s);
            ans.add(s+ch);
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(ss(str));
    }
}
