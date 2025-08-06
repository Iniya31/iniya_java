import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n*n;
        String nStr = Integer.toString(n);
        String sqStr = Integer.toString(square);
        
        if(sqStr.endsWith(nStr)){
            System.out.println("Automorphic");
        }
        else{
            System.out.println("Not Automorphic");
        }
    }
}