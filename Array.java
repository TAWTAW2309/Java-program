/**
 * 
 */
import java.util.*;
/**
 * @author Student
 *
 */
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a scanner object
		Scanner mykeyboard = new Scanner(System.in);
		
		//declare array
		double[] marks;
		
		double total = 0.0, avg=0.0;
		int noofStudents = 0;
		
		System.out.print("How many students are there in class");
		noofStudents=mykeyboard.nextInt(); 
		
		marks = new double[noofStudents]; //creating array based on no of students
		
		//ask student marks
		for (int i =0; i<marks.length; i++) {
			
			//ask user input
			System.out.print("Marks for students" + i+1 + ".");
			
			marks[i] = mykeyboard.nextDouble(); //store marks in array at index
		
	//add marks to total
			total += marks[i];
			
			//average
			avg = total/marks[i];
			
			
		}
		
	}

}
