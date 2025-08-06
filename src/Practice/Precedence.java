package Practice;

public class Precedence {
	public static void main(String[] args) {
 
        int result1 = (5 * 8 % 3 + 6 - 1 / 5);  
        int result2 = ((10 + 3) * 2 % 4 - 5 / 2);  
        int result3 = 7 + 4 * 3 % 5 - 6 / 2;      

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }

}
