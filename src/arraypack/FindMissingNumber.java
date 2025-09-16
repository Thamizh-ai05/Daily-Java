package arraypack;
import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,4,6,5,2};
        int n=arr.length+1;
        int sum1 = (n * (n + 1))/2;
        int sum2 = Arrays.stream(arr).sum();
        System.out.println("Missing Number is: "+(sum1-sum2));
    }
}
