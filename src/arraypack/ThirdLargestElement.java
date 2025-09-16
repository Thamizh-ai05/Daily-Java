package arraypack;

import java.util.*;

public class ThirdLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Array: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Third Largest Element: "+arr[n-3]);
    }
}
