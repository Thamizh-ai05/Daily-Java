import java.util.Scanner;
class Palindromeispossible {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int input1=sc.nextInt();
        int[] arr=new int[10];
        while(input1>0){
            int n=input1%10;
            arr[n]++;
            input1/=10;
        }
        int oddc=0;
        for(int i=0;i<10;i++){
            if(arr[i]%2!=0) oddc++;
        }
        if(oddc<=1) System.out.print("Palindrome is Possible");
        else System.out.print("Palindrome is Not Possible");
	}
}
