import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> Hmap = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            Hmap.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if(Hmap.containsKey(s))
                {
                    System.out.println(s+"="+Hmap.get(s));
                }
            else
                {
                System.out.println("Not found");
            }
            // Write code here
        }
        in.close();
    }
}