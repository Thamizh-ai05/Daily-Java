import java.util.Scanner;
class Orderofdigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		boolean a=true;
		boolean b=true;
		int m=n;
		while(n>=10){
			if(n%10 < (n/10)%10){
				a=false;
				break;
			}
			n=n/10;
		}
		while(m>=10){
			if(m%10 > (m/10)%10){
				b=false;
				break;
			}
			m=m/10;
		}
		if(a) System.out.println("Ascending Order");
		else if(b) System.out.println("Descending Order");
		else System.out.println("Not in Order");
	}
}
