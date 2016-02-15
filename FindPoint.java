package mathematics.fundamentals;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindPoint {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        
        for(int i=0;i<numberOfTestCases;i++){
            int px = in.nextInt();
            int py = in.nextInt();
            int qx = in.nextInt();
            int qy = in.nextInt();
            
            int nx = qx-px;
            int ny = qy-py;
            int rx = qx + nx;
            int ry = qy + ny;
            System.out.println(rx + " " + ry);
        }
    }
}