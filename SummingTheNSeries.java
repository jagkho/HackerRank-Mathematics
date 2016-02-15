package mathematics.fundamentals;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SummingTheNSeries {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        for(int i=0;i<numberOfTestCases;i++)
            {
            BigInteger n = in.nextBigInteger();
            BigInteger product = n.multiply(n);
            System.out.println(product.mod(BigInteger.valueOf(1000000007)));
        }
    }
}