package org.asml;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        int[][] inputArray = {
                {1, 2},
                {5, 6},
                {9, 10},
                {13, 14}
        };

        System.out.printf("Input 2D array:%s", Arrays.deepToString(inputArray));
        Matrix matrix = new Matrix();
        System.out.printf("\nSpiral Print: %s", matrix.spiralPrint(inputArray));
    }

}
