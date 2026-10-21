package src.Recursion.Assignment;

public class withOutLengthFunction{
    public static int size(String s,int i){
        if(s.charAt(i)=='\0'){
            return 0;
        }
        return 1+size(s,i+1);
    }
    public static void main(String[] args){
        System.out.println(size("hello",0));
    }
}

