package p03_IteratorTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class ListIteratorTest {
    private ListIterator listIterator;
    private static final String[] TEST_ARR = {"one", "two", "three"};

    @Before
    public void setup() throws OperationNotSupportedException {
        listIterator = new ListIterator(TEST_ARR);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testInCorrectCreateConstructor() throws OperationNotSupportedException {
        listIterator = new ListIterator(null);
    }

    @Test
    public void testCurrectCreateConstructor() throws OperationNotSupportedException {
        Assert.assertArrayEquals(listIterator.getElements().toArray(new String[0]), TEST_ARR);
    }

    @Test
    public void testCurretctMove() throws OperationNotSupportedException {
        listIterator.move();
        Assert.assertTrue(listIterator.move());
    }

    @Test
    public void testInCurretctMove() throws OperationNotSupportedException {
        listIterator.move();
        listIterator.move();
        listIterator.move();

        Assert.assertFalse(listIterator.move());
    }

    @Test
    public void testCorrectHasNext() throws OperationNotSupportedException {
        listIterator.hasNext();
        listIterator.move();

        Assert.assertTrue(listIterator.hasNext());
    }

    @Test
    public void testInCorrectHasNext() throws OperationNotSupportedException {
        listIterator.hasNext();
        listIterator.move();
        listIterator.hasNext();
        listIterator.move();

        Assert.assertFalse(listIterator.hasNext());
    }

    @Test(expected = IllegalStateException.class)
    public void testInCorrectPrint() throws OperationNotSupportedException {
        listIterator = new ListIterator();
        listIterator.print();
    }

    @Test
    public void testCurrentPrint(){
        for (String s : listIterator.getElements()){
            listIterator.print();
        }
    }
}
