package firstpack;

import java.util.Scanner;

public class gcdex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a=sc.nextInt();
        System.out.println("Enter a Number: ");
        int b=sc.nextInt();

        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD: "+a);
    }
}
