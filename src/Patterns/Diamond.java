package Patterns;

public class Diamond {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			int space = n-i-1;
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			int star=2*i+1;
			for(int k=0;k<star;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-2;i>=0;i--) {
			int space = n-i-1;
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			int star=2*i+1;
			for(int k=0;k<star;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
