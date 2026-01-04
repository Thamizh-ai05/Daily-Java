import java.util.Scanner;
class Palindromenum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int input1=sc.nextInt();
		int n=0;
        int m=input1;
        while(input1>0){
            int a=input1%10;
            n=n*10+a;
            input1=input1/10;
        }
        if(n==m) System.out.println(m+" is Palindrome");
        else System.out.println(m+" is Not Palindrome");
	}
}
