import java.util.Scanner;

public class QuickSort {
	 static String numbers;
	 static int [] numArray;
	public static void main(String[] args) {
		 getUserInput();
		 performSort();
		// TODO Auto-generated method stub

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
		 //choose pivot and sort to either side of pivot...start with length/2
		 //recursive
		
		 int [] lowerHalf = new int [numArray.length/2];
		 int [] upperHalf = new int [numArray.length/2];
		 int j = 0;
		 int p = 0;
		 int pivot = numArray[numArray.length/2];
		 
		 for(int i = 0; i < numArray.length;i++)
		 {
			 if(numArray[i] > pivot){
				 upperHalf[j] = numArray[i];
			 }
			 else if(numArray[i] <= pivot){
				 lowerHalf[p] = numArray[i];
			 }
		 }
		 int [] newArray = new int [numArray.length];
		int count = 0;
		 for(int next = 0; next < lowerHalf.length; next++){
			 newArray[next] = lowerHalf[next];
			 count++;
		 }
		 
		 int index = count + 1;
		 for(int next = 0; next < upperHalf.length; next++){
			 newArray[index] = upperHalf[next];
			 index++;
		 }
	 }
}
