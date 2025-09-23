package Daily_Task;
import java.util.*;
public class Day2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int n=sc.nextInt();
        System.out.println();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("\nSquare Pattern: ");
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n||i==1||j==1||j==n){
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
