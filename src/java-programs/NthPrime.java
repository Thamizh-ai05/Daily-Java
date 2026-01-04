import java.util.Scanner;
class NthPrime {
	public static void main(String[] args) {
		int n=10,c=0,f=0;
        int i=2;
        while(i>0){
            f=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    f=1;
                    break;
                }
            }
            if(f==0) c++;
            if(c==n){ System.out.println(n+"th Prime: "+i); break;}
            i++;
        }
	}
}
