package io.github.salehparsa.Datastructures;

import java.util.Scanner;

/**
 * Created by saleh on 9/13/16.
 */
public class ArraysDS {
    public void ArrayDS()
    {
        int numberOfInteger;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter number of Integers: ");
        numberOfInteger = scnr.nextInt();
        int[] array = new int[numberOfInteger];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scnr.nextInt();
        }

        for (int i = (numberOfInteger - 1); i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
