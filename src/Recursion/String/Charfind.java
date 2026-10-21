package src.Recursion.String;

public class Charfind {
    public static void basic(String name,int i){
        if(i==name.length()){
            return;
        }
        System.out.println(name.charAt(1));
        return;
    }
    public static void main(String[] args){
        basic("Krish",0);
    }
}

