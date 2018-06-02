package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static int [] numArray;
    public static void main(String[] args) {
	getUserInput();
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

    private void performSort(){
        ArrayList upperHalf = new ArrayList<Integer>();
        ArrayList lowerHalf = new ArrayList<Integer>();
        int pivot = numArray[numArray.length/2];

        for(int i = 0; i<numArray.length; i++){
            if(numArray[i] <= pivot){
                lowerHalf.add(i);
            }
            else{
                upperHalf.add(i);
            }
        }
        if(checkIfSorted(upperHalf) == false)//for upper
        {
            recursiveSortUpper(upperHalf,null);
        }

        if(checkIfSorted(lowerHalf) == false)//for lower
        {
            recursiveSortLower(null,lowerHalf);
        }
    }
    private void recursiveSortLower(ArrayList<Integer> upper,ArrayList<Integer> lower)
    {
        int pivot = lower.get(upper.size()/2);

        ArrayList newUpper1 = new ArrayList<Integer>();
        ArrayList newLower1= new ArrayList<Integer>();

        for(int i = 0; i < upper.size();i++)
        {
            if(lower.get(i) <= pivot)
            {
                newLower1.add(i);
            }
            else{
                newUpper1.add(i);
            }
        }

        boolean lowerSorted = checkIfSorted(newLower1);
        boolean upperSorted = checkIfSorted(newUpper1);

        if(lowerSorted == false || upperSorted == false)
        {
            recursiveSortLower(newUpper1, newLower1);
        }
    }
    private void recursiveSortUpper(ArrayList<Integer> upper,ArrayList<Integer> lower)
    {
        int pivot = upper.get(upper.size()/2);

        ArrayList newUpper1 = new ArrayList<Integer>();
        ArrayList newLower1= new ArrayList<Integer>();

        for(int i = 0; i < upper.size();i++)
        {
            if(upper.get(i) <= pivot)
            {
                newLower1.add(i);
            }
            else{
                newUpper1.add(i);
            }
        }

        boolean lowerSorted = checkIfSorted(newLower1);
        boolean upperSorted = checkIfSorted(newUpper1);

        if(lowerSorted == false || upperSorted == false)
        {
            recursiveSortUpper(newUpper1, newLower1);
        }
    }

    private static boolean checkIfSorted(ArrayList<Integer>list){
        for(int i = 0;i<list.size();i++)
        {
            if(i < list.size() - 1 && list.get(i) > list.get(i+1))
            {
                return false;
            }
        }
        return true;
    }
}
