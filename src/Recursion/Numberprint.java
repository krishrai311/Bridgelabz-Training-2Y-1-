package src.Recursion;

public class Numberprint {
    public static void number(int n){
        //Basr Case
        if(n==1){
            System.out.println(n);
            return;
        }
        //Recursive Case
        number(n-1);
        //Self Case
        System.out.println(n);
    }

    public static void main(String[] args) {
        number(10);
    }
}
