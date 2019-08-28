import org.junit.jupiter.api.Test;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class JUnitTest {

    @Test
    public void test_findMax_Valid()
    {
        int[] array = {5,-4,84,43,-50,7};
        Finder find = new Finder();
        Integer actual = find.findMax(array);
        Integer expected = 84;
        assertEquals(expected, actual);
    }

    @Test
    public void test_findMax_Null()
    {
        Finder find = new Finder();
        Integer actual = find.findMax(null);
        Integer expected = null;
        assertEquals(expected, actual);
    }

    @Test
    public void test_findMax_Empty()
    {
        int[] array = {};
        Finder find = new Finder();
        Integer actual = find.findMax(array);
        Integer expected = null;
        assertEquals(expected, actual);
    }

    @Test
    public void test_findMin_Valid()
    {
        int[] array ={5,-4,84,43,-50,7};
        Finder find = new Finder();
        Integer actual = find.findMin(array);
        Integer expected = -50;
        assertEquals(expected, actual);
    }

    @Test
    public void test_findMin_Null()
    {
        Finder find = new Finder();
        Integer actual = find.findMin(null);
        Integer expected = null;
        assertEquals(expected, actual);
    }

    @Test
    public void test_findMin_Empty()
    {
        int[] array ={};
        Finder find = new Finder();
        Integer actual = find.findMin(array);
        Integer expected = null;
        assertEquals(expected, actual);
    }
}
