package Array.Slidingwindow;
import java.util.Scanner;
public class Basic
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum "+sum);
        for(int i=1;i<=arr.length-size;i++){
            sum=sum-arr[i-1]+arr[i+size-1];
            System.out.println(sum);
        }
    }
}
