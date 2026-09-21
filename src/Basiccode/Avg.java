package Basiccode;
import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double average = (a + b + c) / 3;

        System.out.println(average);
    }
}

