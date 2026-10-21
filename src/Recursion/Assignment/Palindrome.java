package src.Recursion.Assignment;

public class Palindrome{
    public static boolean palindrome(String s,int i){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-1-i)){
            return false;
        }
        return palindrome(s,i+1);
    }
    public static void main(String[] args){
        System.out.println(palindrome("madam",0));
    }
}

