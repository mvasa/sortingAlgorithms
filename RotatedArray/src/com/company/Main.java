package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        runRotatedArray();
    }

   static int [] array1;
    static int [] array2;
    private static void runRotatedArray(){

        array1 = new int [33];
        array2 = new int [33];

        System.out.println("\n\n----------------------------Rotated Arrays------------------------\n\n");
        buildRotatedArray();
        printArrays();

        setArraysToCompare(array1, array2);
        compareArrays();

        System.out.println("\n\n-----------------------------Random Arrays------------------------\n\n");
        buildRandomArrays();
        printArrays();

        setArraysToCompare(array1, array2);
        compareArrays();

        System.out.println("\n\n----------------------------Same Arrays------------------------\n\n");
        buildRotatedArray();
        array2 = array1;
        printArrays();

        setArraysToCompare(array1, array2);
        compareArrays();

    }
    private static void buildRotatedArray(){
        Random num = new Random();
        int next = 0;
        for(int i = 0; i<array1.length;i++){
            next = num.nextInt(30);
            array1[i] = next;
        }

        int half = array1.length/2;
        for(int i = 0; i < half; i++)
        {
            array2[half + i] = array1[i];
        }
        for(int i = 0;i<half;i++)
        {
            array2[i] = array1[half + i];
        }
    }

    private static void buildRandomArrays()
    {
        Random num = new Random();
        int next = 0;
        for(int i = 0; i<array1.length;i++){
            next = num.nextInt(30);
            array1[i] = next;
            next = num.nextInt(30);
            array2[i] = next;
        }

    }
    private static void printArrays(){
        for(int i:array1){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i:array2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
        static int  [] arr1;
        static int [] arr2;

        public static void setArraysToCompare(int [] array1, int [] array2)
        {
            arr1 = new int [array1.length];
            arr2 = new int [array2.length];
            arr1 = array1;
            arr2 = array2;
        }

        public static void compareArrays(){
            int half = arr1.length/2;
            boolean rotated = true;

            for(int i = 0; i < half;i++){
                if(arr1[i] == arr2[half + i]){
                    continue;
                }
                else{
                    rotated = false;
                    break;
                }
            }
            //compare other halves here
            for(int i = 0; i < half;i++){
                if(arr1[half + i] == arr2[i]){
                    continue;
                }
                else{
                    rotated = false;
                    break;
                }
            }

            if(rotated)
            {
                System.out.println("rotated");
            }
            else
            {
                System.out.println("not rotated");
            }
        }


}
