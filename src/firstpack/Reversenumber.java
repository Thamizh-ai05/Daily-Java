package firstpack;
import java.util.Scanner;
import static java.lang.Math.abs;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=abs(sc.nextInt());
        int ans=0;
        while (n>0){
            int ld=n%10;
            ans=ans*10+ld;
            n=n/10;
        }
        System.out.println("Reverse of the Given Number is: "+ans);
    }
}