/**
 * Module: Software Development: Programming Foundations
 * Student: Daniel Barbu: 20024094
 * Application: Outcome 4
 * Version: 1.0
 * Date: 25/04/2024
 * File: CalculatorSorter.java
 *
 * @author Daniel Barbu
 * @version 1.0
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Provides functionalities for managing calculation speeds, including entering predefined values,
 * sorting these values, and displaying them. 
 * please see usage of protected access modifier.
 * protected is producing accessibility only in those classes from the same package
 * on this context in this case default package.
 */
import java.util.Scanner;

public class CalculatorSorter {

    /**
     * Prompts the user to enter an array of calculation speeds in milliseconds.
     * User input is then used to create and return an array of doubles.
     *
     * @return speeds array of doubles entered by the user.
     */
    protected double[] enterArrayValues() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many calculation speeds will you enter?");
        int numSpeeds = scanner.nextInt();

        double[] speeds = new double[numSpeeds];
        System.out.println("Enter each calculation speed in milliseconds:");

        for (int i = 0; i < numSpeeds; i++) {
            System.out.print("Speed " + (i + 1) + ": ");
            speeds[i] = scanner.nextDouble();
        }

        scanner.close();
        return speeds;
    }

    /**
     * Sorts an array of calculation valueSpeeds in ascending order from fastest
     * to slowest using the insertion sort algorithm. Based on logic of
     * insertion sort algorithm which is big O notation O(n^2) which n^2
     * represents the array unsorted into a sorted array.
     *
     * @param valueSpeeds The array of calculation valueSpeeds to be sorted.
     * @return valueSpeeds type double to return the values for sorting array
     */
    protected double sortArray(double[] valueSpeeds) {
        // created local variable currentItem
        int currentItem = 0;
        double key = 0d;
        for (int i = 1; i < valueSpeeds.length; i++) {
            // key is assigned valueSpeeds per item in the sorted array
            key = valueSpeeds[i];
            
            currentItem = i - 1;

                                                                                                        /* Move elements of valueSpeeds, that are greater than key,to one position 
                                                                                                        ahead of their current position
                                                                                                        key always is in the first position in the array
                                                                                                        ahead of key is unpartitioned array which will be sorted by 
                                                                                                        comparing with the key */
                                                                                
                                                                                    
            // comparing, swapping and inserting currentItem valueSpeeds according to the key                                                                       
            while (currentItem >= 0 && valueSpeeds[currentItem] > key) {                                 // loop continues currentItem index is greater than or equal to zero 
                valueSpeeds[currentItem + 1] = valueSpeeds[currentItem];                                 // and the value at the currentItem index in the valueSpeeds array is greater than the key.
                currentItem = currentItem - 1;                                                           // If condition is not met, the loop terminates.*/
            }
            
        }
            return valueSpeeds[currentItem + 1] = key;
    }

    /**
     * Displays the sorted array of calculation speeds. Each speed is printed on a new line
     * followed by "ms" to indicate milliseconds, showing the order of calculation speeds
     * from fastest to slowest.
     *
     * @param displaySpeeds The array of sorted calculation displaySpeeds to be displayed.
     */
    protected void displayArray(double[] displaySpeeds) {
        System.out.println("Calculation Speeds (Fastest to Slowest):");
        for (double speed : displaySpeeds) {
            System.out.printf("%.2f ms\n", speed);
        }
    }
}

