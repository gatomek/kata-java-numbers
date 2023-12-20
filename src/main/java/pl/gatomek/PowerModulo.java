package pl.gatomek;

public class PowerModulo {

    public static long calc( long base, long exponent, long modulo) {
        final long mod = base % modulo;

        long result = 1;
        for( long i = 0; i < exponent; i ++) {
            result = result * mod;
            result = result % modulo;
        }

        return result;
    }
}
