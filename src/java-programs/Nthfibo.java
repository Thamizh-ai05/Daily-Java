import java.util.Scanner;
class Nthfibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
		long a=0;
        long b=1;
		if(x==1) b=0;
        for(int i=3;i<=x;i++){
            long temp=a;
            a=b;
            b=temp+b;
        }
		System.out.println(x+"th Fibo: "+b);
	}
}
