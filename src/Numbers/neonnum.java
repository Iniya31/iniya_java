import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int power =(int) Math.pow(temp, 2);
        int sum=0;
        while(power!=0){
            int rem = power%10;
            sum=sum+rem;
            power/=10;
        }
        if(n==sum){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}