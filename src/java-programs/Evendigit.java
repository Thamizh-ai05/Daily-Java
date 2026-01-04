import java.util.Scanner;
class Evendigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Even digits: ");

        while (num != 0) {
            int digit = num % 10;   
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }
            num = num / 10;         
        }
		System.out.println();
	}
}
