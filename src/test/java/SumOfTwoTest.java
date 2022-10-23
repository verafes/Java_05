import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;


public class SumOfTwoTest {

    /**
     * 14.	Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,
     * и число n. Алгоритм  возвращает пары элементов, которые в сумме дают число n.
     * Test Data:
     * ({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}}
     */

    //1. Positive testing Happy path
    // num1 < num2
    @Test
    public void BiggerValue_N1LessN2_Postive_HappyPath() {
        //AAA
        //arrange
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        //act
        int[][] actualResult = SumOfTwo.sumOfTwo(array, sum);

        System.out.println("test1 actual: " + Arrays.deepToString(expectedResult));
        System.out.println("expected: " + Arrays.deepToString(actualResult));

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

}
