package src.Recursion.String;

public class Reverse {
    public static void basic(String name,int i){
        if(i==name.length()){
            return;
        }
        basic(name,i+1);
        System.out.print(name.charAt(i));
    }

    public static void main(String[] args){
        basic("Krish",0);
    }
}
