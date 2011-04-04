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
    public long sum(long upperLimit, int firstMultiple, int secondMultiple) {
        return sumMultiples(upperLimit, firstMultiple)
                + sumMultiples(upperLimit, secondMultiple)
                - sumMultiples(upperLimit, firstMultiple * secondMultiple);
    }

    public long sum(long upperLimit, int firstMultiple, int secondMultiple, int thirdMultiple) {
        return sumMultiples(upperLimit, firstMultiple)
                + sumMultiples(upperLimit, secondMultiple)
                + sumMultiples(upperLimit, thirdMultiple)
                - sumMultiples(upperLimit, firstMultiple * secondMultiple)
                - sumMultiples(upperLimit, firstMultiple * thirdMultiple)
                - sumMultiples(upperLimit, secondMultiple * thirdMultiple)
                + sumMultiples(upperLimit, firstMultiple * secondMultiple * thirdMultiple);
    }

    public long sumMultiples(long upperLimit, int multiple) {
        long n = upperLimit / multiple;
        return (n * (n + 1) / 2) * multiple;
    }
}
