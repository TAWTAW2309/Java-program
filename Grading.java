/**
 * 
 */
import java.util.Scanner;
/**
 * @author Student
 *
 */
public class Grading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade;
		
		Scanner myKeyboard = new Scanner(System.in);
		
		
		System.out.print("What is your grade ?");
		grade = myKeyboard.nextInt();
		
		if (grade >= 80)
			{System.out.println("Congratulations");}
			
			else
				{System.out.println("You could have done better");
				 System.out.println("Make sure you practice");}
				
			System.out.println("bye bye");

	}

}
