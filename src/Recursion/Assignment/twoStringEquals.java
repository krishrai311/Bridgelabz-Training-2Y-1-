package src.Recursion.Assignment;

public class twoStringEquals{
    public static boolean equal(String s1,String s2,int i){
        if(s1.length()!=s2.length()){
            return false;
        }
        if(i==s1.length()){
            return true;
        }
        if(s1.charAt(i)!=s2.charAt(i)){
            return false;
        }
        return equal(s1,s2,i+1);
    }
    public static void main(String[] args){
        System.out.println(equal("hello","hello",0));
    }
}

