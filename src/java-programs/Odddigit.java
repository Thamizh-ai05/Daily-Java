import java.util.Scanner;
class Odddigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Odd digits: ");

        while (num != 0) {
            int digit = num % 10;   
            if (digit % 2 != 0) {
                System.out.print(digit + " ");
            }
            num = num / 10;         
        }
		System.out.println();
	}
}
