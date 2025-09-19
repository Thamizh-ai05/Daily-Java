package Daily_Task;
import java.util.*;
public class Day1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number of rows: ");
        int n=sc.nextInt();
        System.out.println("Upper:");
        for (int i=n;i>0;i--){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("\nLower: ");
        for (int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\nUpper Triangle ");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nLower Triangle: ");
        for (int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
