package arraypack;

import java.util.Scanner;

public class FindRepeatingNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of Array: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       for(int i=0;i<n-1;i++){
           boolean alreadyPrinted = false;
           for (int k = 0; k < i; k++) {
               if (arr[i] == arr[k]) {
                   alreadyPrinted = true;
                   break;
               }
           }

           if (alreadyPrinted) continue;
           for(int j=i+1;j<n;j++){
               if(arr[i]==arr[j]){
                   System.out.println("Repeating: "+arr[j]);
                   break;
               }
           }
       }
    }
}
