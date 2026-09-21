package Arrayandstring;
import java.util.Scanner;
public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int multiplicationTable[] = new int[10];
        for(int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }
    }
}

