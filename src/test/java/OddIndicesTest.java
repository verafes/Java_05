import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;


public class OddIndicesTest {

    /** Positive testing Happy path
     * алгоритм OddIndexes
     * if array
     * Test Data:
     * Input = {-45, 590, 234, 985, 12, 68}
     * Expected Result =  {590, 985, 68}
     */

    @Test
    public void testOddIndices_HappyPath() {
        //AAA
        //arrange
        int [] arr = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        //act
        int[] actualResult = new OddIndices().oddIndices(arr);

        System.out.println("test1" + Arrays.toString(expectedResult));
        System.out.println(Arrays.toString(actualResult));

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    /**
     * allay.length = 1, no odd index
     * return new String[0];
     */
    @Test
    public void testOddIndicesOneElement_HappyPath() {
        //AAA
        //arrange
        int [] arr = {-45};
        int[] expectedResult = {};

        //act
        int[] actualResult = new OddIndices().oddIndices(arr);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    /**
     * Negavive
     * empty array
     * return new String[0];
     */
    @Test
    public void testNoOddNumberEmpty_negative() {
        //AAA
        //arrange
        int[] arr = {};
        int[] expectedResult = {};

        //act
        int[] actualResult = new OddIndices().oddIndices(arr);

       //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
