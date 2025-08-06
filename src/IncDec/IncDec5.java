package Practice;

public class IncDec5 {
	public static void main(String[] args) {
        int m = 5;
        int n = m-- - --m;  

        int p = ++m + m++;  

        System.out.println("m = " + m);
        System.out.println("n = " + n);
        System.out.println("p = " + p);
    }
}
