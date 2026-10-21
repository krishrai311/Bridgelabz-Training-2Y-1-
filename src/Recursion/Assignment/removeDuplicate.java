package src.Recursion.Assignment;

public class removeDuplicate{
    public static String duplicate(String s,int i,String ans){
        if(i==s.length()){
            return ans;
        }
        if(ans.indexOf(s.charAt(i))==-1){
            ans=ans+s.charAt(i);
        }
        return duplicate(s,i+1,ans);
    }
    public static void main(String[] args){
        System.out.println(duplicate("banana",0,""));
    }
}

