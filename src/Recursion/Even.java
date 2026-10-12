package src.Recursion;

public class Even {
    public static void number(int n){
        //Base Case
        if(n==0){
            return;
        }
        //Recursive Case
        number(n-1);
        //Self Case
        if(n%2==0){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        number(10);
    }
}

