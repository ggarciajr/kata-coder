package kata.one;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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
        FirstKata kata = new FirstKata();
        assertEquals(
                kata.sum(1000),
                233168,
                "result should be 233168"
        );

        assertEquals(
                kata.sum(10),
                23,
                "result should be 23"
        );
    }
}
