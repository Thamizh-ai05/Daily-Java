package firstpack;

import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=sc.nextInt();
        int res=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                res+=i;
            }
        }
        System.out.println(res==n?"Yes":"No");
    }
}
