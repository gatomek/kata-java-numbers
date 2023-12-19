package pl.gatomek;

import java.security.NoSuchAlgorithmException;

public class GCD {
    public static long bySubstracting( long a, long b) {
        if( a <= 0 || b <= 0)
            throw new ArithmeticException();

        long t1 = a;
        long t2 = b;

        while( true) {
            long min = Math.min(t1, t2);
            long max = Math.max(t1, t2);

            if (min == max)
                return min;

            t1 = Math.min(min, max);
            t2 = max - min;
        }
    }

    public static long byModulo( long a, long b) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException();
    }
}
