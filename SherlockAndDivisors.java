package mathematics.fundamentals;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndDivisors {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        for(int i=0;i<numberOfTestCases;i++){
            int n = in.nextInt();
            factorize(n);
            if(n%2!=0)
                System.out.println(factorize(n));
            else System.out.println(factorize(n) + 1);
        }
    }
    public static Integer factorize(Integer n){
        try{         
            int count=0;
            int maxD = (int)Math.sqrt(n);
            for(int i=2;i<=maxD;i++){
                if(n%i == 0){
                    if(i%2==0) count+=1;
                    int d = n/i;
                    if(d!=i)
                        if(d%2==0) count+=1;
                }
            }
            return count; 
        }
        catch(Exception e){
            throw e;
        }
    }
}