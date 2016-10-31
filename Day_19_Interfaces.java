import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
   int divisorSum(int n);
}
//Write your code here
 class Calculator implements AdvancedArithmetic
    {
   
    public int divisorSum(int number)
        {
            int sum=0;
            for(int i=1;i<=number;i++)
                {
                if (number%i==0)
                    {
                        sum=sum+i;
                    }
            }
        return sum;
    }
}
class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
