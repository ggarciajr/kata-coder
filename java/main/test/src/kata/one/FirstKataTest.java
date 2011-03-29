package kata.one;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by Eureka.
 * User: ggarcia
 * Date: 3/29/11
 * Time: 3/29/11
 *
 * @author ggarcia
 */
public class FirstKataTest {
    @Test
    public void testSum() {
        List<Integer> multiples = new ArrayList<Integer>();
        multiples.add(3);
        multiples.add(5);

        FirstKata kata = new FirstKata();
        assertEquals(
                kata.sum(1000, multiples),
                233168,
                "result should be 233168"
        );

        assertEquals(
                kata.sum(10, multiples),
                23,
                "result should be 23"
        );
    }

    @Test
    public void testIsMultiple() {
        FirstKata kata = new FirstKata();
        List<Integer> multiples = new ArrayList<Integer>();
        multiples.add(3);
        multiples.add(5);

        assertTrue(kata.isMultiple(6, multiples), "2 should be multiple of 6");
        assertTrue(kata.isMultiple(10, multiples), "2 should be multiple of 6");
    }
}
