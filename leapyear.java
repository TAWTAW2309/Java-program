import java.util.Scanner;;
/**
 * @author Student
 *
 */
public class leapyear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your year:"); //display year 
		
		int year = keyboard.nextInt(); //input year
		
		
		if (((year % 4 ==0) && (year % 100!=0)) || (year%400==0)) 
			 
			//find if year is multiple of 400
			//find if year is multiple of 100
			//find if year is multiple of 4 
			{System.out.println("Specified year is a leap year" );}
			//display leap year
		else 
			{System.out.println("Specified year is not a leap year" );}
			 //display not leap year
		

	}

}
