import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EmptyTest {

    List<String> emptyList;

    @Before
    public void setUp(){
        System.out.println("setUp Method called");
        this.emptyList = new ArrayList<String>();
    }

    @After
    public void tearDown(){
        System.out.println("tearDown Method called");
        emptyList = null;
    }

    @Test
    public void testSomeBehavior(){
        assertEquals("Empty list should have 0 elements", 0, emptyList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testForException(){
        Object object = emptyList.get(0);
    }



}