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
    public long sumMath(double limit) {
        double phi = (1 + Math.sqrt(5)) / 2;
        double fibN = Math.floor(Math.log(Math.sqrt(5) * limit)) / Math.log(phi);
        //double fibN = Math.round(Math.floor(Math.log(Math.sqrt(5) * limit)) / Math.log(phi) + 1.618);
        fibN = (Math.round(fibN) % 2 == 0) ? Math.ceil(fibN + 0.5) : fibN - (fibN % 3);

        return Math.round((Math.floor(Math.pow(phi, fibN + 2) / Math.sqrt(5) + (1 / 2)) - 1) / 2);
    }

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
