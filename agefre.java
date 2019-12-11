/**
 * 
 */
import java.util.*;
/**
 * @author Student
 *
 */
public class agefre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner mykeyboard = new Scanner(System.in);
		
		int noofChildren=0;
		int[] age;
		System.out.print("How many children are there:");
		noofChildren=mykeyboard.nextInt();
		
		age = new int[noofChildren];
		
		for (int i =0; i<age.length; i++) {
			
			System.out.print("Age of child" + (i+1) + ".");
			age[i] = mykeyboard.nextInt();
			}
		
		int count0=0,count1=0,count2=0,count3=0,count4=0,count5=0;
		int count6=0,count7=0,count8=0,count9=0,count10=0;
		int i = 0;
		for (i=0; i<noofChildren; i++) {
		
			
			if (age[i] == 0) {
				count0++; 
			}
		
			if (age[i] == 1) {
				count1++; 
			}
		
			if (age[i] == 2) {
				count2++; 
			}
		
			if (age[i] == 3) {
				count3++; 
			}
		
			if (age[i] == 4) {
				count4++; 
			}
		
			if (age[i] == 5) {
				count5++; 
			}
		
			if (age[i] == 6) {
				count6++; 
			}
		
			if (age[i] == 7) {
				count7++; 
			}
		
			if (age[i] == 8) {
				count8++; 
			}
		
			if (age[i] == 9) {
				count9++; 
			}
		
			if (age[i] == 10) {
				count10++; 
			}
		}
		
			System.out.println("Children having age 0:" + count0);
			System.out.println("Children having age 1:" + count1);
			System.out.println("Children having age 2:" + count2);
			System.out.println("Children having age 3:" + count3);
			System.out.println("Children having age 4:" + count4);
			System.out.println("Children having age 5:" + count5);
			System.out.println("Children having age 6:" + count6);
			System.out.println("Children having age 7:" + count7);
			System.out.println("Children having age 8:" + count8);
			System.out.println("Children having age 9:" + count9);
			System.out.println("Children having age 10:" + count10);


	}
}


