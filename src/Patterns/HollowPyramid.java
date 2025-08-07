package Patterns;

public class HollowPyramid {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			int space = n-i-1;
			for(int j=0;j<space;j++) {
				System.out.print(" ");
			}
			int star=2*i+1;
			for(int k=0;k<star;k++) {
				if(k==0||k==star-1||i==n-1)
					System.out.print("*");
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
