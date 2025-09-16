package arraypack;

import java.util.Scanner;
import java.util.Arrays;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while (true) {
            System.out.println("1. Array Elements");
            System.out.println("2. Min Element in Array");
            System.out.println("3. Max Element in Array");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("The array elements are: " + Arrays.toString(arr));
                    break;
                case 2:
                    int mn = arr[0];
                    for (int i = 1; i < n; i++) {
                        mn = min(mn, arr[i]);
                    }
                    System.out.println("Minimum: " + mn);
                    break;
                case 3:
                    int mx = arr[0];
                    for (int i = 1; i < n; i++) {
                        mx = max(mx, arr[i]);
                    }
                    System.out.println("Maximum: " + mx);
                    break;
                case 4:
                    System.out.println("Bye Bye...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
