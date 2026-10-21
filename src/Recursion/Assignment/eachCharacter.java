package src.Recursion.Assignment;

public class eachCharacter {
    public static void print(String s,int i){
        if(i==s.length()){
            return;
        }
        System.out.println(s.charAt(i));
        print(s,i+1);
    }
    public static void main(String[] args){
        print("cat",0);
    }
}

