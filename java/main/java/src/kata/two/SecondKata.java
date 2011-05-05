package kata.two;

/**
 * Created by Eureka.
 * User: ggarcia
 * Date: 4/26/11
 * Time: 15:28
 *
 * @author ggarcia
 */
public class SecondKata {
    public long sum(double limit) {
        long n = Math.round(((Math.log(limit * Math.sqrt(5))) * 2) + 1.618);
        long sum = 0;

        for (long i = 6; i < n; i++) {
            long fib = (4 * fib(i - 3)) + fib(i - 6);

            if (fib % 2 == 0)
                sum += fib;
        }

        return sum + 2;
    }

    private long fib(long n) {
        return (n < 2) ? n : fib(n - 1) + fib(n - 2);
    }
}
