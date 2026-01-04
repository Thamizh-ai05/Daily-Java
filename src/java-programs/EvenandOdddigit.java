import java.util.Scanner;
class EvenandOdddigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
		int num1=num;
        System.out.print("Even digits: ");
        while (num != 0) {
            int digit = num % 10;   
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }
            num = num / 10;         
        }
		System.out.println();
		System.out.print("Odd digits: ");
		while (num1 != 0) {
            int digit = num1 % 10;   
            if (digit % 2 != 0) {
                System.out.print(digit + " ");
            }
            num1 = num1 / 10;         
        }
		System.out.println();
	}
}
