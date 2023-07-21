package p02_ExtendedDatabase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class testDatabase {
    private static final Person[] PEOPLE = {new Person(1, "Ivan")
                                          , new Person(2, "Dragan")
                                          , new Person(3, "Petkan")};
    private Database database;
    @Before
    public void prepareData() throws OperationNotSupportedException {
        database = new Database(PEOPLE);
    }

    @Test
    public void testCurrectConstructorCreate() throws OperationNotSupportedException {
        Person[] currentArr = database.getElements();

        Assert.assertArrayEquals(PEOPLE, currentArr);

        Assert.assertEquals(PEOPLE.length, currentArr.length);

        Assert.assertEquals(PEOPLE.length - 1, currentArr.length - 1);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testExceptionAdd() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testInCurrectConstructorCreateMostNumbers() throws OperationNotSupportedException {
        Person[] testArr = new Person[17];
        database = new Database(testArr);
    }


    @Test
    public void testCurrectAddElement() throws OperationNotSupportedException {
        database.add(new Person(4, "Cifkan"));
        Assert.assertEquals(PEOPLE.length + 1, database.getElementsCount());
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testExceptionRemove() throws OperationNotSupportedException {

        for (int i = 0; i < PEOPLE.length; i++) {
            database.remove();
        }

        database.remove();
    }

    @Test
    public void testCurrectRemoveElement() throws OperationNotSupportedException {
        database.remove();

        Assert.assertEquals(PEOPLE.length - 1, database.getElementsCount());
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testExceptionExpectByNullUserName () throws OperationNotSupportedException {
        database.findByUsername(null);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void estFindByUsernameMoreThanPerson() throws OperationNotSupportedException {
        database.add(new Person(4, "Ivan"));
        database.findByUsername("Ivan");
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testNotExistPerson() throws OperationNotSupportedException {
        database.findByUsername("Misho");
    }

    @Test
    public void testCurrectAddPerson() throws OperationNotSupportedException {
       Person person = database.findByUsername("Dragan");

       Assert.assertEquals(person.getId(), 2);
       Assert.assertEquals(person.getUsername(), "Dragan");
    }



    @Test (expected = OperationNotSupportedException.class)
    public void testExceptionExpectByNotExistId () throws OperationNotSupportedException {
        database.findById(4);
    }

    @Test
    public void testCurrectAddPersonById() throws OperationNotSupportedException {
        Person person = database.findById(3);

        Assert.assertEquals(person.getId(), 3);
        Assert.assertEquals(person.getUsername(), "Petkan");
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testFindByIdMoreThanOneId() throws OperationNotSupportedException {
        database.add(new Person(2, "Iko"));
        database.findById(2);
    }
}
