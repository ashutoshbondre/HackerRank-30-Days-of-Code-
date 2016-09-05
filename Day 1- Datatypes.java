import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
                /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;
        /* Read and save an integer, double, and String to your variables.*/
        i2=scan.nextInt();
        int sum=i+i2;
        System.out.println(sum);
        d2=scan.nextDouble();
        double sumDouble=d+d2;
        System.out.println(sumDouble);
        scan.nextLine();
        s2=scan.nextLine();
        System.out.print(s+s2);
        //System.out.print(s + " " + s2);
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
       scan.close();

    }
}
