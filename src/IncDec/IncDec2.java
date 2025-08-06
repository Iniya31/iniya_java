package Practice;

public class IncDec2 {
	public static void main(String[] args) {
        int a = 5;
        int b = a++ + 2;        
        int c = ++a + b--;      
        int d = b-- - --a;      
        int e = a++ + b++ + c--; 
        System.out.println("a = " + a); 
        System.out.println("b = " + b); 
        System.out.println("c = " + c); 
        System.out.println("d = " + d);
        System.out.println("e = " + e); 
    }
}
