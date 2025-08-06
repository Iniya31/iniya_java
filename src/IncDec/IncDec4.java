package Practice;

public class IncDec4 {
	public static void main(String[] args) {
		int x = 2;
	    int y = x++ + ++x;  

	    int z = --x + x--;  

	    System.out.println("x = " + x);
	    System.out.println("y = " + y);
	    System.out.println("z = " + z);
	}
}
