package pl.gatomek;

public class GCDbySubtract {

    private GCDbySubtract() {

    }

    public static long calc(long a, long b) {
        if( a <= 0 || b <= 0)
            throw new ArithmeticException();

        long t1 = a;
        long t2 = b;

        while( true) {
            long min = Math.min(t1, t2);
            long max = Math.max(t1, t2);

            if (min == max)
                return min;

            t1 = min;
            t2 = max - min;
        }
    }
}
