package arraypack;
import java.util.*;
public class RotateArray {
    public static void rotate(int[] arr){
        int i=0,j=arr.length-1;
         while(i!=j){
             int temp =arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
         }
         //Another Method
        /*int ld=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=ld;*/
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Array 1: ");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("How many time you want to rotate: ");
        int k=sc.nextInt();
        for (int i = 0; i < k; i++) {
           rotate(arr);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
