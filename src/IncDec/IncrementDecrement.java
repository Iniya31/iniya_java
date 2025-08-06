package Practice;

public class IncrementDecrement {
	public static void main(String[] args) {
		int a = 5;
	    int b = ++a;      
	    int c = a++;      
	    int d = --a;    
	    int e = a--;      

	    int x = 5;
	    int y = x++ + ++x; 

	    int m = 3;
	    int n = ++m * 2 + m--; 

	    System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("m = " + m);
        System.out.println("n = " + n);
	}
}
