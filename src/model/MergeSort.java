/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pablo Herrero
 */
public class MergeSort {

    public static int[] mergeSort(int[] myArray, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {

            return myArray;
        } else {
            int midPoint = (lowIndex + highIndex) / 2;

            mergeSort(myArray, lowIndex, midPoint);
            mergeSort(myArray, midPoint + 1, highIndex);

            merge(myArray, lowIndex, midPoint, highIndex);

            return myArray;
        }
    }

    public static int[] merge(int myArray[], int lowIndex, int midPoint, int highIndex) {
        int sizeArrayL = midPoint - lowIndex + 1;
        int sizeArrayR = highIndex - midPoint;

        int arrayL[] = new int[sizeArrayL];
        int arrayR[] = new int[sizeArrayR];

        for (int i = 0; i < sizeArrayL; i++) {
            arrayL[i] = myArray[lowIndex + i];
        }
        for (int j = 0; j < sizeArrayR; j++) {
            arrayR[j] = myArray[midPoint + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = lowIndex;

        while(i<sizeArrayL && j<sizeArrayR){
            if (arrayL[i] <= arrayR[j]) {
                myArray[k] = arrayL[i];
                i++;
            } else {
                myArray[k] = arrayR[j];
                j++;
            }
            k++;
        }
        
        while (i < sizeArrayL) {
            myArray[k] = arrayL[i];
            i++;
            k++;
        }

        while (j < sizeArrayR) {
            myArray[k] = arrayR[j];
            j++;
            k++;
        }
        
        return myArray;
    }
}
