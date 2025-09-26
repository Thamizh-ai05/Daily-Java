package Daily_Task;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        /*Map<String, Integer> m=new HashMap<>();
        m.put("Apple",100);
        m.put("Orange",150);
        m.put("Banana",50);
        m.put("Egg",60);
        int value=m.get("Egg");
        System.out.println(value);
        for(Map.Entry<String, Integer> pair:m.entrySet()){
            System.out.println(pair.getKey()+":"+pair.getValue());
        }*/
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No of Rows: ");
        int n=sc.nextInt();
        System.out.print("Enter the No of Columns: ");
        int m=sc.nextInt();
        int[][] mat=new int[n][m];
        System.out.println("Enter the Values: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}