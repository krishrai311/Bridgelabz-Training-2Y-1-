package src.Recursion.String;

public class Basic {
    public static void basic(String name,int i){
        if(i==name.length()){
            return;
        }

        System.out.print(name.charAt(i));
        basic(name,i+1);
    }

    public static void main(String[] args){
        basic("Krish",0);
    }
}
