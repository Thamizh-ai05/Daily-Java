import java.util.Scanner;
class Maxdigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
		int max=0;
        while (num != 0) {
            int digit = num % 10;   
            if (digit > max) {
				max=digit;
            }
            num = num / 10;         
        }
		System.out.println("Max: "+max);
	}
}
