import java.util.Scanner;
class Ascending {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		boolean flag=true;
		while(n>=10){
			if(n%10 < (n/10)%10){
				flag=false;
				break;
			}
			n=n/10;
		}
	if(flag) System.out.println("Ascending Order");
	else System.out.println("Not Ascending Order");
	}
}
