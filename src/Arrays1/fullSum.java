package Arrays1;
import java.util.Scanner;

public class fullSum {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int{n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int oddsum=0;
        int evensum=0;
        int evenInd=0;
        int oddInd =0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evensum+=arr[i];
            }else{
                oddsum+=arr[i];
            }
            
            if(i%2==0){
                evenInd+=arr[i];
            }else{
                oddInd+=arr[i];
            }
        }
        
        System.out.print(evensum+" ");
        System.out.print(oddsum+" ");
        System.out.print(evenInd+" ");
        System.out.print(oddInd);
    }
}
