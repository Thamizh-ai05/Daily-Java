package firstpack;
import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        int m=n;
        int res=0;
        while(n!=0){
            int ld=n%10;
            res+=Math.pow(ld,3);
            n=n/10;
        }
        System.out.println(m==res?"Armstrong":"Not a Armstrong");
    }
}
