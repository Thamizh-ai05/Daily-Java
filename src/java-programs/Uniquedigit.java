import java.util.Scanner;
class Uniquedigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		 int[] freq = new int[10]; // 0 to 9 digits
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            if (freq[digit] == 0) {   // first time occurrence
                count++;
                freq[digit] = 1;
            }
            num = num / 10;
        }
        System.out.println("Unique digit count = " + count);
	}
}
