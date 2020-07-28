/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pablo Herrero
 */
public class AuxMethods {
    
    public static int[] createRandomArray() {
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
        }
        return myArray;
    }

    public static void showArray(int myArray[]) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " | ");
        }
        System.out.println("");
    }

    public static int findArrayMax(int myArray[]) {
        List<Integer> myList = new ArrayList<Integer>();
        for (int i : myArray) {
            myList.add(i);
        }

        int max;
        return max = Collections.max(myList);
    }

    public static int findArrayMin(int myArray[]) {
        List<Integer> myList = new ArrayList<Integer>();
        for (int i : myArray) {
            myList.add(i);
        }

        int min;
        return min = Collections.min(myList);
    }
}
