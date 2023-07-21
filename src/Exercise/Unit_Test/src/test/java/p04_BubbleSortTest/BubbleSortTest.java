package p04_BubbleSortTest;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {


    @Test
    public void testCurretctAcendingSortArr(){
        int[] arrTest = {5, 8, 6, 9, 1, 4, 3, 7, 2 , 10};

        Bubble.sort(arrTest);

        int[] exceptedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assert.assertArrayEquals(arrTest, exceptedArr);
    }
}
