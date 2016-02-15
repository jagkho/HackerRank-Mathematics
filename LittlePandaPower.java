package mathematics.number.theory;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LittlePandaPower {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        
        for(int i=0;i<numberOfTestCases;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int x = in.nextInt();
            
            BigInteger bi = BigInteger.valueOf(a).modPow(BigInteger.valueOf(b), BigInteger.valueOf(x));
            System.out.println(bi);
        }
    }
    public static long modPow(int a, int b, int x){
        if(x == 1) return 0;
        long c = 1;
        for(int i=1;i<=b;i++)
            c = (c*a)%x;
        return c;
    }
}