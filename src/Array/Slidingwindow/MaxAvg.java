package Array.Slidingwindow;
import java.util.Scanner;
public class MaxAvg
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size");
        int size=sc.nextInt();
        System.out.println("Length of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Implement");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int maxsum=0;
        for(int i=0;i<size;i++){
            sum=sum+arr[i];
        }
        maxsum=sum;
        for(int i=1;i<=arr.length-size;i++){
            sum=sum-arr[i-1]+arr[i+size-1];
            maxsum=Math.max(maxsum,sum);
            int avg=maxsum/size;
            System.out.println("Maxsum "+maxsum);
            System.out.println("Avg "+avg);
        }

    }
}

