import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        temp=n;
        int sum=0;
        while(temp!=0){
            int rem = temp%10;
            sum+=Math.pow(rem,count);
            temp/=10;
        }
        if(sum==n){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}