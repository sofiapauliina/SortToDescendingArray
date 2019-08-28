package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // The classic challenge of taking in an array and sorting it manually

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getInputArray(6);
        int[] myDescendingArray = sortArrayToDescending(myArray);

    }

    public static int[] getInputArray (int amountOfNumbers) {
        int[] array = new int[amountOfNumbers];
        System.out.println("Please input " + amountOfNumbers + " numbers to be sorted");

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
        System.out.println("Inputted array element in position " + i + " is " + array[i]);
        }

        return array;
    }

    public static int[] sortArrayToDescending (int[] array) {
        int[] descendingArray = Arrays.copyOf(array, array.length);

        boolean controller = true;
        int temporaryValueStored;

        while (controller){

            controller = false;
            for (int i = 0; i < descendingArray.length-1; i++) {

                if (descendingArray[i] < descendingArray[i+1]){
                    temporaryValueStored = descendingArray[i];
                    descendingArray[i] = descendingArray[i+1];
                    descendingArray[i+1] = temporaryValueStored;
                    controller = true;
                }
            }
        }
        for (int i = 0; i < descendingArray.length; i++) {
            System.out.println("Sorted array element in position " + i + " is " + descendingArray[i]);
        }

        return descendingArray;
    }
}
