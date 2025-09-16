package arraypack;

import java.util.Scanner;

public class SearchaElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Array: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a Element to search: ");
        int target=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i]==target){
                System.out.print("The Element "+target+" Found At Index of "+ i);
            }
        }
    }
}
