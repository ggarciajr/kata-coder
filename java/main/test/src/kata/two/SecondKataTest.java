package kata.two;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

/**
 * Created by Eureka.
 * User: ggarcia
 * Date: 4/26/11
 * Time: 15:48
 *
 * @author ggarcia
 */
public class SecondKataTest {
    @Test
    public void testSum() {
        SecondKata kata = new SecondKata();
        assertEquals(kata.sum(4000000), 4613732l, "4613732");

        assertEquals(kata.sum(50), 44, "44");

        assertEquals(kata.sum(150), 188, "188");
    }
}
