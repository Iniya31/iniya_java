package Arrays1;
import java.util.Scanner;

public class ArrayAvg {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        
        long sum=0;
        for(long result : arr){
            sum=sum+result;
        }
        System.out.println(sum/n);
    }
}
