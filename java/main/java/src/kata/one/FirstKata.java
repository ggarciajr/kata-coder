package kata.one;

/**
 * Created by Eureka.
 * User: ggarcia
 * Date: 3/29/11
 * Time: 3/29/11
 *
 * @author ggarcia
 */
public class FirstKata {
    public int sum(int upperLimit) {
        int sum = 0;

        for (int i = 0; i < upperLimit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
