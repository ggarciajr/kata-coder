package kata.two;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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
        assertEquals(kata.sum(), 4613732, "4613732");
    }
}
