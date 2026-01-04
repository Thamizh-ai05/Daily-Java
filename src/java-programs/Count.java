import java.util.Scanner;
class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
		    int c=0;
        if (num == 0) {
            c = 1;
        } else {
            while (num != 0) {
                c++;
                num = num / 10;
            }
        }
		System.out.println("Count: "+c);
	}
}
