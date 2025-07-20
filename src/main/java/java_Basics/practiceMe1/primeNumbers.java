package java_Basics.practiceMe1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class primeNumbers {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(primeNumbers.class);

        for (int num = 2; num <= 50; num++) {
            if (isPrime(num)) {
                log.info("Prime number found: " + num);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
