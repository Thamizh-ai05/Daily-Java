package Daily_Task;

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String s=sc.nextLine();
        int n= s.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i || j==n-i-1){
                    System.out.print(s.charAt(i));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
