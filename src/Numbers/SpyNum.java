import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int prod = 1;
        while(n!=0){
            int rem = n%10;
            sum+=rem;
            prod*=rem;
            n=n/10;
        }
        if(sum==prod){
            System.out.println("Spy Number");
        }else{
            System.out.println("Not a Spy Number");
        }
    }
}