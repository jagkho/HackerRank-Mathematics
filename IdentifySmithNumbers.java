package mathematics.number.theory;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IdentifySmithNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if(primeFactorize(n) == getDigitSum(n))
            System.out.println(1);
        else System.out.println(0);
    }
    public static long getDigitSum(long n){
        long sum=0;
        long num = n;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static long primeFactorize(long n){
        try{
            long sum = 0;
            for(long i=2;i<=n/i;i++){
                while(n%i==0){
                    sum+=getDigitSum(i);
                    n/=i;
                }
            }
            if(n>1)
                sum+=getDigitSum(n);
            return sum;
        }
        catch(Exception e){
            throw e;
        }
    }
}