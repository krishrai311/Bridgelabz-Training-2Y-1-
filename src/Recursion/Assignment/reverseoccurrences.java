package src.Recursion.Assignment;


public class reverseoccurrences {
    public static String remove(String s,char ch,int i){
        if(i==s.length()){
            return "";
        }
        if(s.charAt(i)==ch){
            return remove(s,ch,i+1);
        }
        return s.charAt(i)+remove(s,ch,i+1);
    }
    public static void main(String[] args){
        System.out.println(remove("banana",'a',0));
    }
}

