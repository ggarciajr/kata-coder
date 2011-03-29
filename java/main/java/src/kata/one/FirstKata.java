package kata.one;

import java.util.List;

/**
 * Created by Eureka.
 * User: ggarcia
 * Date: 3/29/11
 * Time: 3/29/11
 *
 * @author ggarcia
 */
public class FirstKata {
    public int sum(int upperLimit, List<Integer> multiples) {
        int sum = 0;

        for (int i = 0; i < upperLimit; i++) {
            if (isMultiple(i, multiples)) {
                sum += i;
            }
        }

        return sum;
    }

    public boolean isMultiple(int number, List<Integer> multiples) {
        for (int multiple : multiples) {
            if (number % multiple == 0) {
                return true;
            }
        }

        return false;
    }
}
