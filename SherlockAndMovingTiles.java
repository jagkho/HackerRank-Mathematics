package mathematics.fundamentals;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndMovingTiles {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int S1 = in.nextInt();
        int S2 = in.nextInt();
        int Q = in.nextInt();
        double rootTwo = Math.sqrt(2);
        for(int i=0;i<Q;i++){
            double qi = in.nextDouble();
            double qiRoot = Math.sqrt(2*qi);
            double relVelocity = Math.abs(S1-S2);
            double time = (L*rootTwo-qiRoot)/relVelocity;
            System.out.println(time);
        }
    }
}