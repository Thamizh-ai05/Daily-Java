import java.util.Scanner;
class OddEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		int even=0,odd=0;
		while(n!=0){
			if(n%2==0) even++;
			else odd++;
			n=n/10;
		}
		System.out.println("Even: "+even+"\nOdd: "+odd);
	}
}
