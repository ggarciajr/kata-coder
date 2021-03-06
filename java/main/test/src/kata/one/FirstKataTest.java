package kata.one;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Eureka.
 * User: ggarcia
 * Date: 3/29/11
 * Time: 13:48
 *
 * @author ggarcia
 */
public class FirstKataTest {
    @Test
    public void tesSumMulti() {
        FirstKata kata = new FirstKata();
        assertEquals(kata.sumMultiples(10l, 3), 18, "18");
        assertEquals(kata.sumMultiples(10l, 5), 15, "15");
    }

    @Test
    public void testSum() {
        FirstKata kata = new FirstKata();
        assertEquals(
                kata.sum(999999999, 3, 5, 7),
                271428571071428566l,
                "result should be 233333333166666668l"
        );

        assertEquals(
                kata.sum(21, 3, 5, 7),
                140,
                "result should be 23"
        );

        assertEquals(
                kata.sum(999, 3, 5),
                233168,
                "result shoul be 233168"
        );

        assertEquals(
                kata.sum(9, 2, 4),
                24,
                "result shoul be 24"
        );
    }
}


