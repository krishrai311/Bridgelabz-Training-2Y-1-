package src.Recursion.Arrays;

public class Basic {
    public static void basic(int arr[],int i){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        basic(arr,i+1);
    }

    public static void main(String[] args){
        int arr[]={1,2,3,5,67,89};
        basic(arr,0);
    }
}
