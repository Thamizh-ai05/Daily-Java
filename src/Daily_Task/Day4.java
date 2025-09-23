package Daily_Task;

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Array Element: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array Elements are... ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}