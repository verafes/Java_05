import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SumArrayTest {

    /**
     * Positive testing Happy path
     * Test Data:
     * {0, 1, 2, 3, 4, 5} → 15
     */

    @Test
    public void testSumArray_positiveNumbers_HappyPath() {
        //AAA
        //arrange
        int[] array1 = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        //act
        int actualResult = SumArray.sumArray(array1);


        //AAA
        //arrange
        int[] array2 = {-7, -3};
        int ex2 = -10;

    }

    /**
     * Positive testing Happy path
     * Test Data:
     * {-7, -3} → -10
     */
    @Test
    public void testSumArray_negativeNumbers_HappyPath() {

        //AAA
        //arrange
        int[] array2 = {-7, -3};
        int expectedResult = -10;

        //act
        int actualResult = SumArray.sumArray(array2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    /**
     * Positive testing Happy path
     * 1 value in array
     * {1} → 1
     */
    @Test
    public void testSumArray_OneValue_Negative() {

        //AAA
        //arrange
        int[] array3 = {1};
        int expectedResult = 1;

        //act
        int actualResult = SumArray.sumArray(array3);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    /**
     * Positive testing Happy path
     * Empty array
     * {} → 0
     */
    @Test
    public void testSumArray_empty_Negative() {

        //AAA
        //arrange
        int[] array3 = {};
        int expectedResult = 0;

        //act
        int actualResult = SumArray.sumArray(array3);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


}
