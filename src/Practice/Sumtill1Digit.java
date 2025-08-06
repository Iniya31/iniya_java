package Practice;
import java.util.Scanner;

public class Sumtill1Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int temp = n*m;
		
		while(temp>9) {
			int sum = 0;
			while(temp!=0) {
				int rem = temp%10;
				sum+=rem;
				temp/=10;
			}
			temp=sum;
		}
		System.out.println(temp);
	}
}
