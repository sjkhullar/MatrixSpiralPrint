package org.asml;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MatrixTest {

    private Matrix matrix = new Matrix();

    @Test
    /**
     * Given null array, when null array is passed to
     * spiralPrint method then it return empty list
     * @param void
     * @return void
     */
    public void givenNull2DArrayReturnsEmptyArray() {
        int[][] emptyArray = null;
        List<Integer> result = matrix.spiralPrint(emptyArray);
        List<Integer> expectedArray = new ArrayList<>();

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedArray.size(),
                "Output list should be empty");
        assertIterableEquals(result, expectedArray);
    }

    @Test
    /***
     * Given empty array, when empty array is passed to
     * spiralPrint method then it return empty list
     */
    public void givenEmpty2DArrayOutputsEmptyArray() {
        int[][] emptyArray = {};
        List<Integer> result = matrix.spiralPrint(emptyArray);
        List<Integer> expectedArray = new ArrayList<>();

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedArray.size(),
                "Output list should be empty");
        assertIterableEquals(result, expectedArray);
    }

    @Test
    /***
     * Given an array having empty element, when input array is passed to
     * spiralPrint method then it returns empty list
     */
    public void givenEmptyArrayReturnsEmptyArray() {
        int[][] emptyArray = {{}, {}, {}};
        List<Integer> result = matrix.spiralPrint(emptyArray);
        List<Integer> expectedArray = new ArrayList<>();

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedArray.size(),
                "Output list should be empty");
        assertIterableEquals(result, expectedArray);
    }

    @Test
    /***
     * Given an array having 1 element, when input array is passed to
     * spiralPrint method then it return 1 element in returned list
     */
    public void given1by1ArrayThenValidResult() {
        int[][] inputArray = {{20}};
        List<Integer> result = matrix.spiralPrint(inputArray);
        List<Integer> expectedList = Arrays.asList(20);

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedList.size(),
                String.format("Output list should have %d elements", inputArray.length));
        assertIterableEquals(result, expectedList);
    }

    @Test
    /***
     * Given an 2D array of 1 cross 4 elements, when input array is passed to
     * spiralPrint method then it returns list
     */
    public void given1by4ArrayThenValidResult() {
        int[][] inputArray = {{1, 20, 30, -10}};

        List<Integer> result = matrix.spiralPrint(inputArray);
        List<Integer> expectedList = Arrays.asList(1, 20, 30, -10);

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedList.size(),
                String.format("Output list should have %d elements", inputArray.length));
        assertIterableEquals(result, expectedList);
    }

    @Test
    /***
     * Given an 2D array of 3 cross 1 with negative elements, when input array is passed to
     * spiralPrint method then it returns the list in spiral order
     */
    public void given3by1ArrayThenValidResult() {
        int[][] inputArray = {
                {10},
                {20},
                {-10}
        };

        List<Integer> result = matrix.spiralPrint(inputArray);
        List<Integer> expectedList = Arrays.asList(10, 20, -10);

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedList.size(),
                String.format("Output list should have %d elements", inputArray.length));
        assertIterableEquals(result, expectedList);
    }

    @Test
    /***
     * Given an 2D array of 2 cross 6 elements, when input array is passed to
     * spiralPrint method then it returns the list in spiral order
     */
    public void given2by6ArrayThenValidResult() {
        int[][] inputArray = {
                {1, 2, 3, 4, 5, 6},
                {6, 5, 4, 3, 2, 1}
        };
        List<Integer> result = matrix.spiralPrint(inputArray);
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 5, 6,
                1, 2, 3, 4, 5, 6);

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedList.size(),
                String.format("Output list should have %d elements", inputArray.length));
        assertIterableEquals(result, expectedList);
    }

    @Test
    /***
     * Given an 2D array of 3*3 elements having negative numbers,
     * when input array is passed to
     * spiralPrint method then it returns the list in spiral order
     */
    public void given3by3ArrayThenValidResult() {
        int[][] inputArray = {
                {-41, 334, 169},
                {478, 962, -705},
                {-281, -961, 995}
        };
        List<Integer> result = matrix.spiralPrint(inputArray);
        List<Integer> expectedList = Arrays.asList(
                -41, 334, 169, -705, 995, -961, -281, 478, 962
        );

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedList.size(),
                String.format("Output list should have %d elements", inputArray.length));
        assertIterableEquals(result, expectedList);
    }

    @Test
    /***
     * Given an 2D array of 5*2 elements, when input array is passed to
     * spiralPrint method then it returns the list in spiral order
     */
    public void given5by2ArrayThenValidResult() {
        int[][] inputArray = {
                {482, 323},
                {-390, 292},
                {174, -197},
                {544, 147},
                {186, -256}
        };
        List<Integer> result = matrix.spiralPrint(inputArray);
        List<Integer> expectedList = Arrays.asList(
                482, 323, 292, -197, 147,
                -256, 186, 544, 174, -390
        );

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedList.size(),
                String.format("Output list should have %d elements", inputArray.length));
        assertIterableEquals(result, expectedList);
    }

    @Test
    /***
     * Given an 2D array of 4*1 elements, when input array is passed to
     * spiralPrint method then it returns the list in spiral order
     */
    public void given4by1ArrayThenValidResult() {
        int[][] inputArray = {
                {1},
                {5},
                {9},
                {13}
        };
        List<Integer> result = matrix.spiralPrint(inputArray);
        List<Integer> expectedList = Arrays.asList(1, 5, 9, 13);

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedList.size(),
                String.format("Output list should have %d elements", inputArray.length));
        assertIterableEquals(result, expectedList);
    }

    @Test
    /***
     * Given an 2D array of 4*4 elements, when input array is passed to
     * spiralPrint method then it returns the list in spiral order
     */
    public void given4by4ArrayThenValidResult() {

        int[][] inputArray = {
                {1, 2, 3, -4},
                {5, 6, 7, 8},
                {-9, 10, 11, 12},
                {13, -14, 15, 16}
        };
        List<Integer> result = matrix.spiralPrint(inputArray);
        List<Integer> expectedList = Arrays.asList
                (1, 2, 3, -4, 8, 12, 16, 15,
                        -14, 13, -9, 5, 6, 7, 11, 10);

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedList.size(),
                String.format("Output list should have %d elements", inputArray.length));
        assertIterableEquals(result, expectedList);
    }

    @Test
    /***
     * Given an 2D array of 4*4 elements with negative numbers
     * , when input array is passed to
     * spiralPrint method then it returns the list in spiral order
     */
    public void given4by4NegativeArrayThenValidResult() {

        int[][] inputArray = {
                {5, -3, -2, 3},
                {-1, 3, 7, -2},
                {-7, -3, 9, -6},
                {0, 8, 0, 4}
        };
        List<Integer> result = matrix.spiralPrint(inputArray);
        List<Integer> expectedList = Arrays.asList
                (5, -3, -2, 3, -2, -6,
                        4, 0, 8, 0, -7, -1, 3, 7, 9, -3);

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedList.size(),
                String.format("Output list should have %d elements", inputArray.length));
        assertIterableEquals(result, expectedList);
    }

    @Test
    /***
     * Given an 2D array of 4*3 elements, when input array is passed to
     * spiralPrint method then it returns the list in spiral order
     */
    public void given4Cross3ArrayThenValidResult1() {
        int[][] inputArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        List<Integer> result = matrix.spiralPrint(inputArray);
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4, 8, 12,
                11, 10, 9, 5, 6, 7);

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedList.size(),
                String.format("Output list should have %d elements", inputArray.length));
        assertIterableEquals(result, expectedList);
    }

    @Test
    /***
     * Given an 2D array of 4*2 elements, when input array is passed to
     * spiralPrint method then it returns the list in spiral order
     */
    public void given4by2ArrayThenValidResult1() {
        int[][] inputArray = {
                {1, 2},
                {5, 6},
                {9, 10},
                {13, 14}
        };
        List<Integer> result = matrix.spiralPrint(inputArray);
        List<Integer> expectedList = Arrays.asList(1, 2, 6, 10, 14, 13, 9, 5);

        assertNotNull(result, "Output list should be Not Null");
        assertTrue(result.size() == expectedList.size(),
                String.format("Output list should have %d elements", inputArray.length));
        assertIterableEquals(result, expectedList);
    }
}