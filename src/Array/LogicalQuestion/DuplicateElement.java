package Array.LogicalQuestion;
import java.util.Scanner;
public class DuplicateElement {

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1)
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static void DuplicateElement(int arr[]) {
        System.out.println("Duplicate");
        display(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        System.out.println("After removing");
        display(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        DuplicateElement(arr);
    }
}
