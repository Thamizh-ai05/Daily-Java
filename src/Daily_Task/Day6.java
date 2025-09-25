package Daily_Task;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array 1: ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        System.out.print("Enter Array 1 Element: ");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter length of array 2: ");
        int m=sc.nextInt();
        int[] arr2=new int[m];
        System.out.print("Enter Array 2 Element: ");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        if(n==m) {
            int[] arr3 = new int[n];
            for (int i = 0; i < n; i++) {
                arr3[i] = arr1[i] + arr2[i];
            }
            System.out.println("Addition:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr3[i] + " ");
            }
        }
        else{
            System.out.println("Size is Different.");
        }
    }
}
