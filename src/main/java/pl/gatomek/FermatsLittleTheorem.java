package pl.gatomek;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FermatsLittleTheorem {
    public static void main(String[] args) throws Exception {
        for( long p = 2; p < 100; p ++) {
            boolean isPrime = FermatsLittleTheorem.isPrime( p, 25);
            if (isPrime)
                System.out.println(p);
        }
    }

    public static boolean isPrime( Long p, int nProbes) throws ArithmeticException {
        if( nProbes < 0)
            throw new ArithmeticException();

        Random random = new Random();
        int counter = 0;

        while( true) {
            final long a = random.nextLong(100_000_000) + 1;

            final long nwd = GCDbySubtract.calc(a, p);
            if (nwd != 1) {
                continue;
            }

            final long rest = PowerModulo.calc( a, p-1, p) - 1;
            if( rest != 0)
                return false;

            if( ++ counter >= nProbes)
                break;
        }

        return true;
    }
}


