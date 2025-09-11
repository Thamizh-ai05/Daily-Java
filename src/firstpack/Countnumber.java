package firstpack;
import java.util.Scanner;
public class Countnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        int c=0;
        if(n==0){
            c=1;
        }
        while(n!=0){
            n/=10;
            c+=1;
        }
        System.out.println("The Count of the Given Number is "+c);
    }
}
/**
 * Another Method....
 * public class Countnumber {
 *     public static void main(String[] args) {
 *         Scanner sc=new Scanner(System.in);
 *         System.out.print("Enter a Number: ");
 *         int n=sc.nextInt();
 *         String num = Long.toString(n);
 *         System.out.println("The Count of the Given Number is "+num.length());
 *     }
 * }
 */