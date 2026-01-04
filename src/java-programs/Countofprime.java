import java.util.Scanner;
class Countofprime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Starting Range: ");
		int input1=sc.nextInt();
		System.out.print("Enter Ending Range: ");
		int input2=sc.nextInt();
		int c=0,f=0;
        for(int i=input1;i<=input2;i++){
            f=0;
            for(int j=2;j<i;j++){
                if(i%j==0){ f=1; break;}
            }
            if(f==0) c++;
        }
        System.out.println("The No. Of Prime Number is :"+c);
	}
}
