package firstpack;

import java.util.Scanner;

public class PowerofNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a=sc.nextInt();
        System.out.println("Enter a Number: ");
        int b=sc.nextInt();
        System.out.println("Power is: "+Math.pow(a,b));
        //With Loop No Build In Function
        int result=a;
        for (int i = 1; i < b; i++) {
            result = result * a;
        }
        System.out.println("Power is: "+result);
    }
}
