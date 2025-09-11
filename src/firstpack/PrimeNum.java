package firstpack;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        if (n <= 1) {System.out.println("Not"); return;}
        if (n == 2) {System.out.println("Yes"); return;}
        if (n % 2 == 0) {System.out.println("Not"); return;}

        for(int i=3;i*i<n;i++){
            if (n % i == 0) {System.out.println("Not");
            return;}
        }
        System.out.println("Yes");
    }
}
