package arraypack;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySubset {
    public static boolean issubset(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        while(i<arr1.length & j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            } else if (arr1[i]==arr2[j]) {
                i++;
                j++;
            }else {
                return false;
            }
        }
        return (j==arr2.length);
    }

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
        if(issubset(arr1, arr2) || issubset(arr2, arr1)) {
            System.out.println("One array is a subset of the other");
        }
        else {
            System.out.println("Not a Subset");
        }
    }
}
