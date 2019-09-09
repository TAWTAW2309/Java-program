/**
 * 
 */
import java.util.*;
/**
 * @author Tawhid Nubheebucus
 *
 */
public class TestSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	 
        

        Scanner myKeyboard = new Scanner(System.in);

       

        while (true) {

                       

                      int []array;

                     

                       

                       System.out.print("Which sort do you want to use Bubble sort, Selection sort , Insertion sort and Quick sort : ");

                      String a = myKeyboard.nextLine();//next; for 1 word

                            



                      System.out.print("Length Of list : ");

                      int n = myKeyboard.nextInt();

                      array = new int [n];

                     

                       Sort type = new Sort();

                      n = array.length;

                        System.out.println("Enter Element Of Array: ");

                        int i;

                             for(i=0; i<n; i++)

                             {

                                 array[i] = myKeyboard.nextInt();

                             }





                          if (a.equalsIgnoreCase("quick sort")  )

                        {

                        int low = 0;

                        int high = n-1;

                        type.QuickSort(array, low, high);

                        type.QuickSort(array);

                        }

                          else if (a.equalsIgnoreCase("bubble sort"))

                         {

                                   type.BubbleSort(array);

                                   type.printBubbleSort(array);

                         }

                          else if(a.equalsIgnoreCase("insertion sort"))

                         {        

                                   type.InsertionSort(array);

                                                 type.printInsertionSort(array);

                         }

                     

                          else if (a.equalsIgnoreCase("selection sort"))

                          {

                                   type.Selectionsort(array);

                                   type.printSelectionsort(array);

                          }

                         

                       else //(a!="selection sort" || a != "insertion sort" || a != "bubble sort" || a != "quick sort");

                        {System.out.println("please enter a valid type of sorting .");

                        }



                         System.out.print("Do you wish to continue ?" );

                         String ans = myKeyboard.next();

                     

                       if (ans.equalsIgnoreCase("Yes"))

                      {

                        continue;

                         }

                      else if (ans.equalsIgnoreCase("No"))

                      {

                        System.out.println(" Thank you !");

                        break;

                      }

                       

         }

}

                     



}



