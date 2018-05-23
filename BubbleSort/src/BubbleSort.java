import java.util.Scanner;

public class BubbleSort {

	 static String numbers;
	 static char [] charArray;
	 static int [] numArray;
	 public static void main(String[] args)
	 {
		 getUserInput();
		 performSort();
		 printSortedArray();
	}
	 
	 private static void getUserInput()
	 {
		 Scanner next = new Scanner(System.in);
		 System.out.print("Enter length of list: ");
		 int length  = next.nextInt();
		 numArray = new int[length];
	        
		 for(int i = 0; i<numArray.length;i++)
		 {
			 System.out.print(i+ ": ");
			 int number = next.nextInt();
			 System.out.println();
			 numArray[i] = number;
		 }
	 }	    
	 
	 private static void performSort()
	 {
		 boolean change = false;
		 for(int i = 0;i < numArray.length - 1; i++)
		 {
			 if(numArray[i] > numArray[i+1])
			 {
				 int tempGreater = numArray[i];
				 numArray[i] = numArray[i+1];
				 numArray[i+1] = tempGreater;
				 change  = true;
			 }
		 }
		 
		 if(change)
		 {
			 performSort();
		 }
	 }
	 
	 private static void printSortedArray()
	 {
		 for(int i = 0; i < numArray.length;i++)
		 {
			 System.out.print(numArray[i] + " ");
		 }
	}
}
