package p01_Database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class testDatabase {

    private static final Integer[] NUMBERS = {2, 4, 7, 3, 12};
    private Database database;
    @Before
    public void prepareData() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }

    @Test
    public void testCurrectConstructorCreate() throws OperationNotSupportedException {
        Integer[] currentArr = database.getElements();

        Assert.assertArrayEquals(NUMBERS, currentArr);

        Assert.assertEquals(NUMBERS.length, currentArr.length);

        Assert.assertEquals(NUMBERS.length - 1, currentArr.length - 1);
    }


    @Test (expected = OperationNotSupportedException.class)
    public void testInCurrectConstructorCreateMostNumbers() throws OperationNotSupportedException {
        Database database = new Database(17);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testInCurrectConstructorCreateLessNumbers() throws OperationNotSupportedException {
        Integer[] testArr = new Integer[0];
        Database database = new Database(testArr);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testExceptionAdd() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testCurrectAddElement() throws OperationNotSupportedException {
        database.add(10);
        Assert.assertEquals(NUMBERS.length + 1, database.getElementsCount());
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testExceptionRemove() throws OperationNotSupportedException {

        for (int i = 0; i < NUMBERS.length; i++) {
            database.remove();
        }

        database.remove();
    }

    @Test
    public void testCurrectRemoveElement() throws OperationNotSupportedException {
        database.remove();

        Assert.assertEquals(NUMBERS.length - 1, database.getElementsCount());
    }
}
