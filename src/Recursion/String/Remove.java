package src.Recursion.String;
import java.util.*;
public class Remove {
    public static String reverse(String s,int i){
        if(i==s.length()){
            return "";
        }
        String small=reverse(s,i+1);
        char ch=s.charAt(i);
        if(ch!='a'){
            return ch+small;
        }
        else{
            return small;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s,0));
    }
}


