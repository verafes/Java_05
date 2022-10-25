import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * 12.	Написать алгоритм SortArray, который принимает на вход массив целых чисел,
 * и сортирует элементы массива в порядке возрастания.
 * Test Data:
 * {4, 3, 7, 12, 5, 2, 9, 4, 12} → {2, 3, 4, 4, 5, 7, 9, 12, 12}
 */

public class SortArrayTest {

    //1. Positive testing Happy path
    // valid array with positive numbers only

    @Test
    public void SortArrayTest_Positive_HappyPath() {
        //AAA
        //arrange
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int[] expectedResult = {2, 3, 4, 4, 5, 7, 9, 12, 12};

        //act
        int[] actualResult = SortArray.bubbleSortArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    // valid array with positive and negative numbers
    @Test
    public void SortArrayTest_Happy() {
        //AAA
        //arrange
        int[] array = {4, 3, -7, 12, 5, 0, 2, 9, -4, 12};
        int[] expectedResult = {-7, -4, 0, 2, 3, 4, 5, 9, 12, 12};

        //act
        int[] actualResult = SortArray.bubbleSortArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    // array with one postive number
    @Test
    public void SortArrayTest_oneNegativeNumber_HappyPath() {
        //AAA
        //arrange
        int[] array = {-1};
        int[] expectedResult = {-1};

        //act
        int[] actualResult = SortArray.bubbleSortArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    // array with one positive number
    @Test
    public void SortArrayTest_onePositiveNumber_HappyPath() {
        //AAA
        //arrange
        int[] array = {1};
        int[] expectedResult = {1};

        //act
        int[] actualResult = SortArray.bubbleSortArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    // empty array
    @Test
    public void SortArrayTest_EmptyArray_Negative() {
        //AAA
        //arrange
        int[] array = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = SortArray.bubbleSortArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    // null array
    @Test
    public void SortArrayTest_NullArray_Negative() {
        //AAA
        //arrange
        int[] array = null;
        int[] expectedResult = {};

        //act
        int[] actualResult = SortArray.bubbleSortArray(array);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

}
