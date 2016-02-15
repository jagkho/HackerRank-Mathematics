package mathematics.number.theory;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FibonacciFinding {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        for(int i=0;i<numberOfTestCases;i++){
            long a = in.nextLong();
            long b = in.nextLong();
            long n = in.nextLong();
            
            //System.out.println(fib(n));
            long result = a*fib(n-1) + b*fib(n);
            System.out.println(result%1000000007);
        }
    }
    public static long fib(long n){
        long[][] F = {{1, 1},{1, 0}};
        if (n == 0)
            return 0;
        power(F, n-1);
        return F[0][0];
    }
    public static void power(long[][] F, long n){
        if( n == 0 || n == 1)
            return;
        long[][] M = {{1,1},{1,0}};

        power(F, n/2);
        multiply(F, F);

        if (n%2 != 0)
            multiply(F, M);
    }
    public static void multiply(long[][] F, long[][] M){
        long c = 1000000007;
        long x =  ((F[0][0]%c)*(M[0][0]%c))%c + ((F[0][1]%c)*(M[1][0]%c))%c;
        long y =  ((F[0][0]%c)*(M[0][1]%c))%c + ((F[0][1]%c)*(M[1][1]%c))%c;
        long z =  ((F[1][0]%c)*(M[0][0]%c))%c + ((F[1][1]%c)*(M[1][0]%c))%c;
        long w =  ((F[1][0]%c)*(M[0][1]%c))%c + ((F[1][1]%c)*(M[1][1]%c))%c;

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }
}