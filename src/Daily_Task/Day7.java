package Daily_Task;

import java.util.*;
public class Day7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Array 1: ");
        int n=sc.nextInt();
        int[] arr1 = new int[n];
        System.out.print("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter Length of Array 2: ");
        int m =sc.nextInt();
        int[] arr2 = new int[m];
        System.out.print("Enter " + m + " Elements: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
    }
}
