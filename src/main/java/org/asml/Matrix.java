package org.asml;

import java.util.ArrayList;
import java.util.List;

public class Matrix {

    /***
     * Print 2D array matrix in spiral path
     * @param arInput: 2D input array
     * @return: List of numbers traversed in spiral path
     */
    public List<Integer> spiralPrint(int[][] arInput) {

        List<Integer> listSpiralPath = new ArrayList<>();

        /***
         * check for nullity and length of input arrays
         */
        if (arInput == null || arInput.length < 1)
            return listSpiralPath;

        int bRow = arInput.length;
        int rCol = arInput[0].length;
        int tRow = 0, lCol = 0;

        /***
         * Traverse the 2D array, row-wise and column wise
         */
        while (tRow < bRow && lCol < rCol) {

            //traverse top row (left to right)
            int tempCol = lCol;
            while (tempCol < rCol) {
                listSpiralPath.add(arInput[tRow][tempCol++]);
            }
            tRow++;

            //traverse right column (top to bottom)
            int tempRow = tRow;
            while (tempRow < bRow) {
                listSpiralPath.add(arInput[tempRow][rCol - 1]);
                tempRow++;
            }
            rCol--;

            //traverse bottom row (right to left)
            tempCol = rCol;

            while (tempCol > lCol && bRow > tRow) {
                listSpiralPath.add(arInput[bRow - 1][--tempCol]);
            }
            bRow--;

            //traverse left column (bottom to top)
            tempRow = bRow;

            while (tempRow > tRow && rCol > lCol) {
                listSpiralPath.add(arInput[tempRow - 1][lCol]);
                tempRow--;
            }
            lCol++;
        }

        return listSpiralPath;
    }
}
