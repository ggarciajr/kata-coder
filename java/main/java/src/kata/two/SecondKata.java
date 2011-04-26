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
    public long sum() {
        long sum = 0;

        for (int i = 1; i < 1000000; i++) {
            long fibNum = fib(i);

            if (fibNum > 4000000) {
                break;
            }

            if (isEven(fibNum)) {
                sum += fibNum;
            }
        }
        
        return sum;
    }

    private boolean isEven(long n) {
        return (n % 2) == 0;
    }

    private long fib(long n) {
        return (n < 2) ? n : fib(n - 1) + fib(n - 2);
    }
}
