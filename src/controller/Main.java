/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.*;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author Pablo Herrero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*******ALGORITHMS*******");
        System.out.println("");
        
        System.out.println("Select an algorithm:");
        System.out.println("1. Insertion sort");
        System.out.println("2. Merge sort");
        System.out.println("0. Exit");
        
        Scanner sc = new Scanner(System.in);
        int userSelection = sc.nextInt();
        
        while (userSelection != 0) {
            switch (userSelection) {
                case 1:
                    System.out.println("\n*****INSERTION SORT*****");
                    
                    int myArray[] = AuxMethods.createRandomArray();

                    System.out.println("Unsorted array:");

                    AuxMethods.showArray(myArray);

                    InsertionSort.sortArray(myArray);

                    System.out.println("Sorted array:");

                    AuxMethods.showArray(myArray);
                    break;
                case 2:
                    System.out.println("\n*****MERGE SORT*****");

                    int unsortedArray[];
                    int sortedArray[];
                    int highIndex;
                    int lowIndex;
                    
                    unsortedArray = AuxMethods.createRandomArray();
                    highIndex = AuxMethods.findArrayMax(unsortedArray);
                    lowIndex = AuxMethods.findArrayMin(unsortedArray);
                    
                    System.out.println("Unsorted array:");
                    AuxMethods.showArray(unsortedArray);

                    System.out.println("Sorted array:");
                    sortedArray = MergeSort.mergeSort(unsortedArray, lowIndex, highIndex);
                    AuxMethods.showArray(unsortedArray);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
            System.out.println("");
            System.out.println("Select an algorithm:");
            System.out.println("1. Insertion sort");
            System.out.println("2. Merge sort");
            System.out.println("0. Exit");
            userSelection = sc.nextInt();
        }

    }
    
}
