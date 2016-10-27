import java.util.*;
import java.io.*;
//Write your code here
class Calculator 
  {
    public int power(int a,int b) throws Exception
        {
        if(a<0||b<0)
            {
            throw new Exception("n and p should be non-negative");
            }
        int result = (int)(Math.pow(a,b));
        return result;
    }
  }
class Solution{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
