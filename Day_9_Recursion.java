import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int answer=factorial(num);
        System.out.println(answer);
    }
    public static int factorial(int n)
        {
            if(n==1)
                return 1;
            else
                return (n*factorial(n-1));
    }
}