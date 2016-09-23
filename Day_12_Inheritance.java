import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
	private int[] testScores;
    Student(String first, String last, int id, int[] s)
        {
           super(first,last,id);
            testScores=s;
        }
     
		    public char calculate() {
		        char grade;
                int score=0;
                int len = testScores.length;
                for(int i=0;i<len;i++)
                    {
                        score = score + testScores[i];
                    }
                score=score/len;
		        
		        if (score < 40){
		            grade = 'T';
		        } else if (40 <= score && score < 55){
		            grade = 'D';
		        } else if (55 <= score && score < 70){
		            grade = 'P';
		        } else if (70 <= score && score < 80){
		            grade = 'A';
		        } else if (80 <= score && score < 90){
		            grade = 'E';
                }else {
		            grade = 'O';
		        }
		        
		        return grade;
		    }
		}
		class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}