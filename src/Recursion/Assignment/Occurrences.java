package src.Recursion.Assignment;


public class Occurrences{
    public static int count(String s,char ch,int i){
        if(i==s.length()){
            return 0;
        }
        if(s.charAt(i)==ch){
            return 1+count(s,ch,i+1);
        }
        return count(s,ch,i+1);
    }
    public static void main(String[] args){
        System.out.println(count("banana",'a',0));
    }
}

