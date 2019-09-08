package polystudent;

/**
*
*/

import java.util.*;

/**
 * @author nubhe
 *
 */
public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String inputStudentName, inputStudentAdd;
		int inputStudentNo;
		char inputStudentGender;
		
		/*create a student object*/
		student s1 = new student();
		
		Scanner myScanner = new Scanner(System.in);
		
		
		System.out.println("Enter name of student 1: ");
		inputStudentName = myScanner.nextLine();
		
		System.out.println("Enter address of student 1: ");
		inputStudentAdd = myScanner.nextLine();
		
		System.out.println("Enter StudentId of student 1: ");
		inputStudentNo = myScanner.nextInt();
		
		System.out.println("Enter gender of student 1: ");
		inputStudentGender = myScanner.next().charAt(0);
		
		/*ask user input for address,studentId,gender*/
		
		/* set the attribute student s1*/
		s1.setname(inputStudentName);
		s1.setstudentno(inputStudentNo);
		s1.setadd(inputStudentAdd);
		s1.setgender(inputStudentGender);
		
		System.out.println("Name of student is " +s1.getName());
		System.out.println("Student id of student is "+s1.getstudentno());
		System.out.println("Gender of student is "+s1.getgender());
		System.out.println("student address is "+s1.getadd());
		
		
		student s2 = new student();
		
		System.out.println("Enter name of student 2: ");
		inputStudentName = myScanner.next();
		
		System.out.println("Enter address of student 2: ");
		inputStudentAdd = myScanner.next();
		
		System.out.println("Enter studentId of student 2: ");
		inputStudentNo = myScanner.nextInt();
		
		System.out.println("Enter gender of student 2");
		inputStudentGender = myScanner.next().charAt(0);
		
		
		s2.setname(inputStudentName);
		s2.setstudentno(inputStudentNo);
		s2.setadd(inputStudentAdd);
		s2.setgender(inputStudentGender);
		
		System.out.println("Name of student is "+s2.getName());
		System.out.println("student id of student is "+s2.getstudentno());
		System.out.println("Gender of student is"+s2.getgender());
		System.out.println("student address is "+s2.getadd());
		
		
		/*ask user input for name, add, student no & gender*/
		System.out.println("Enter name of student 4: ");
		inputStudentName = myScanner.next();
		
		System.out.println("Enter address of student 4: ");
		inputStudentAdd = myScanner.next();
		
		System.out.println("Enter student# of student 4: ");
		inputStudentNo = myScanner.nextInt();
		
		System.out.println("Enter gender of student 4");
		inputStudentGender = myScanner.next().charAt(0);
		
		student s4 = new student(inputStudentName, inputStudentNo, inputStudentAdd,inputStudentGender);
	    System.out.println(s4.toString());	
	
	    
	    /* student not yet assigned a student no*/
	    student s5 = new student(inputStudentName, inputStudentAdd, inputStudentGender);
		System.out.println("Enter name of student 5: ");
		inputStudentName = myScanner.next();
		
		System.out.println("Enter address of student 5: ");
		inputStudentAdd = myScanner.next();
		
		System.out.println("Enter student# of student 5: ");
		inputStudentNo = myScanner.nextInt();
		
		System.out.println("Enter gender of student 5");
		inputStudentGender = myScanner.next().charAt(0);
	    
	     System.out.println(s5.toString());
	}

}
