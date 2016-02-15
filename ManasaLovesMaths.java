package mathematics.number.theory;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ManasaLovesMaths {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        in.nextLine();
        for(int i=0;i<numberOfTestCases;i++)
            {
            String s = in.nextLine();
            //System.out.println(s);
            if(s.length()>1){
                int[] arr = new int[s.length()];
                for(int j=0;j<s.length();j++)
                    arr[j] = Character.getNumericValue(s.charAt(j));
                Arrays.sort(arr);
                StringBuilder sb = new StringBuilder();
                StringBuilder temp = new StringBuilder();
                for(int j=0;j<arr.length;j++){
                    sb.append(arr[j]);
                    temp.append(arr[j]);
                }
                //System.out.println("sb " + sb);
                //System.out.println("temp " + temp);
                boolean isBroken = false;
                while(!sb.reverse().toString().equals(temp.toString())){
                    String inLoopString = temp.toString();
                    String substr = inLoopString == null || inLoopString.length() < 3 ?             inLoopString:inLoopString.substring(inLoopString.length() - 3);
                    //System.out.println(substr);
                    if(Integer.valueOf(new String(substr))%8==0){
                        System.out.println("YES");
                        isBroken = true;
                        break;
                    }
                    arr = getNextPermutation(arr);
                    StringBuilder perm = new StringBuilder();
                    for(int j=0;j<arr.length;j++)
                        perm.append(arr[j]);
                    //System.out.println(perm);*/
                    temp = perm;
                }
                if(!isBroken) System.out.println("NO");
            }
            else if(s.length() == 1){
                int n = Integer.valueOf(s);
                if(n%8==0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
    public static int[] getNextPermutation(int[] arr){
        int i=arr.length-1;
        while (i > 0 && arr[i - 1] >= arr[i])
            i--;

        if(i>0)
        {
            int j = arr.length-1;
            while(arr[j] <= arr[i-1])
                j--;

            int temp = arr[i - 1];
            arr[i - 1] = arr[j];
            arr[j] = temp;

            j = arr.length - 1;
            while (i < j) 
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return arr;
    }
}