package Arrays1;
import java.util.Scanner;

public class Countevenodd {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        
        int oddcount=0;
        int evencount=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
}
