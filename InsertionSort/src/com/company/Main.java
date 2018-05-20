package com.company;

import java.util.Scanner;
public class Main {

    static String numbers;
    static char [] charArray;
    static int [] numArray;
    public static void main(String[] args) {
	//get user input
    getUserInput();
    //build array
    buildArray();
    //call insertion sort
    performSort();

    }

    private static void getUserInput()
    {
        Scanner next = new Scanner(System.in);
        System.out.print("Enter list of numbers to be sorted: ");
        numbers  = next.nextLine();
        System.out.println(numbers);
    }

    private static void buildArray()
    {
        int num = numbers.trim().toCharArray().length;
        charArray = new char[num];
        charArray = numbers.trim().toCharArray();
        int arraySize  = 0;
        for( char i : charArray)
        {
            if(i != 32)
            {
                arraySize++;
            }
        }

        numArray = new int[arraySize];
        int next = 0;
        for( char i : charArray)
        {
            if(i != 32)
            {
                numArray[next] = Character.getNumericValue(i);
                next++;
            }
        }

        for(int i : numArray){
            System.out.println(i);
        }
    }

    private static void performSort()
    {

    }

}
