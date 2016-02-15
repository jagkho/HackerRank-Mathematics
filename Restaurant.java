package mathematics.fundamentals;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Restaurant {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        for(int i=0;i<numberOfTestCases;i++){
            int l = in.nextInt();
            int b = in.nextInt();
            int area = l*b;
            int maxSquareSide = (int)Math.sqrt(area);
            
            int maxSideTillNow = 1;
            int resSquares = area;
            for(int j=2;j<=maxSquareSide;j++){
                if(l%j==0 && b%j==0){
                    int squareArea = (int)Math.pow(j, 2);
                    if(area%squareArea==0){
                        if(j>maxSideTillNow){
                            maxSideTillNow = j;
                            resSquares = area/squareArea;
                        } 
                    }
                }
            }
            System.out.println(resSquares);
        }
    }
}