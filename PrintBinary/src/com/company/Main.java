package com.company;

public class Main {

    public static void main(String[] args) {
	setNumToConvert(57);
	convertToBinary();
    }

    static int numToConvert = 0;

    public static void setNumToConvert(int number)
    {
        numToConvert = number;
    }

    public static void convertToBinary()
    {
        int exp = 0;
        while(Math.pow(2, exp)< numToConvert)
        {
            exp++;
        }

        int arraySize = exp;
        exp--;
        System.out.println(arraySize);
        int [] binary = new int [arraySize];

        binary[arraySize - 1] = 1;
        double exponent = Math.pow(2, exp);
        Integer num = (int) exponent;
        numToConvert = numToConvert - num;
        exp--;
        arraySize--;
        while(numToConvert > 0 && exp > -1)
        {
            double newExp = Math.pow(2, exp);
            int expToInt = (int) newExp;
            if(newExp <= numToConvert)
            {
                binary[arraySize-1] = 1;
                exponent = Math.pow(2, exp);
                num = (int) exponent;
                numToConvert = numToConvert - num;
               // System.out.println(numToConvert);
                exp--;
                arraySize--;
            }

            else
            {
                binary[arraySize - 1] = 0;
                exp--;
                arraySize--;
            }
        }


        for(int i = binary.length - 1; i > -1;i--)
        {
            System.out.print(binary[i]+ " ");
        }

    }
}
