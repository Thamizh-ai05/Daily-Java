package firstpack;

import java.util.Scanner;

import static java.lang.Math.abs;

public class SumofDegit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        long n=abs(sc.nextLong());
        long ans=0;
        while (n!=0){
            long ld=n%10;
            ans=ans+ld;
            n=n/10;
        }
        System.out.println("The sum of the degits are: "+ans);
    }
}
