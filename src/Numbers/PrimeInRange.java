import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt(), end = sc.nextInt();
        boolean foundPrime = false;
        for(int num = start ; num<=end ; num++){
            boolean isPrime = true;
            if(num<=1) continue;
            for(int i = 2; i<num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num+" ");
                foundPrime=true;
            }
        }
        if (!foundPrime) {
            System.out.println("No prime numbers");
        }
    }
}