package mathematics.number.theory;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClosestNumber {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        for(int i=0;i<numberOfTestCases;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int x = in.nextInt();
            
            if(a==1) System.out.println(1);
            else if(b<=0) System.out.println(0);
            else{
                long power = (long)Math.pow(a, b);
                if(power%x == 0) System.out.println(power);
                else {
                    //System.out.println("Power: " + power + "Mod: " + power%x);
                    if((power%x)>(x-(power%x)))
                        System.out.println(power+(x-(power%x)));
                    else
                        System.out.println(power-(power%x));
                }
            }
        }
    }
}