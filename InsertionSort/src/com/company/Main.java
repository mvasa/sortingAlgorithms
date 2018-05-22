package com.company;

import java.util.Scanner;
public class Main {

    static String numbers;
    static char [] charArray;
    static int [] numArray;

    public static void main(String[] args)
    {
        getUserInput();
        buildArray();
        performSort();
    }

    private static void getUserInput()
    {
        Scanner next = new Scanner(System.in);
        System.out.print("Enter list of numbers to be sorted: ");
        numbers  = next.nextLine();
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
    }

    private static void performSort()
    {
        for(int i = 0; i < numArray.length; i++)
        {
            if(i > 0)
            {
                int currIndex = i;
                while (numArray[currIndex] <= numArray[currIndex - 1] && currIndex > 0)
                {
                    int tempG = numArray[currIndex - 1];
                    numArray[currIndex - 1] = numArray[currIndex];
                    numArray[currIndex] = tempG;
                    currIndex--;
                    if(currIndex == 0)
                    {
                        break;
                    }
                }
            }
        }

        for(int i : numArray)
        {
            System.out.print(i + " ");
        }
    }
}
