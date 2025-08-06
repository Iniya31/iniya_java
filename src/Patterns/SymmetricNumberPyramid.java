import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=1;
        for(int i=0;i<n;i++){
            int space=n-i-1;
            for(int j=0;j<space;j++){
                System.out.print("  ");
            }
            int fill=2*i+1;
            for(int k=0;k<fill;k++){
                System.out.print(count+" ");
                if(k<fill/2)
                    count++;
                else
                    count--;
            }
            count=1;
            System.out.println();
        }
    }
}