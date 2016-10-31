import java.io.*;
import java.util.*;
public class Solution {
    // Write your code here.
    Stack s= new Stack();
    que kkk=new que();
    void enqueueCharacter(char ch)
        {
        kkk.enqueueCharacter(ch);
        }
     char dequeueCharacter()
       {
         char ans = (char)kkk.dequeueCharacter();
         return ans;
        } 
    public class que
        {
        LinkedList q;
        public que()
            {
            q=new LinkedList();
            }
       void enqueueCharacter(char ch)
        {
            q.addLast(ch);
        }
    char dequeueCharacter()
        {
         char ans = (char)q.remove(0);
         return ans;
        } 
    }
   void pushCharacter(char c)
        {
        s.push(c);
    }
    char popCharacter()
        {
        char ans=(char)s.pop();
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
