import java.util.Scanner;
class SteppingNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		boolean a=true;
		while(n>=10){
			int b=n%10-(n/10)%10;
			if(b!=-1 && b!=1){
				a=false;
				break;
			}
			n=n/10;
		}
		if(a) System.out.println("Yes");
		else System.out.println("No");
	}
}
