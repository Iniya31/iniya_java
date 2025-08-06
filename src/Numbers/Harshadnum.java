import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int sum=0;
        while(temp!=0){
            int rem=temp%10;
            sum=sum+rem;
            temp/=10;
        }
        temp=n;
        if(temp%sum==0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not Harshad Number");
        }
    }
}