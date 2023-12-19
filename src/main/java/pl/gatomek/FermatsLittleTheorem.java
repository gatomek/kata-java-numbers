package pl.gatomek;

import java.util.Random;

public class FermatsLittleTheorem {
    public static void main(String[] args) throws Exception {
        for( long p = 2; p < 100; p ++) {
            boolean isPrime = FermatsLittleTheorem.isPrime( p, 25);
            if (isPrime)
                System.out.println(p);
        }
    }

    public static boolean isPrime( Long p, int nProbes) throws Exception {
        if( nProbes < 0)
            throw new Exception();

        Random random = new Random();
        int counter = 0;

        while( true) {
            final long a = random.nextLong( p * 10) + 1;

            final long nwd = GCD.bySubstracting(a, p);
            if (nwd != 1) {
                continue;
            }

            long result = a;
            for (int i = 1; i < p; i++)
                result *= a;
            result -= a;

            final long rest = result % p;
            if( rest != 0)
                return false;

            if( ++ counter >= nProbes)
                break;
        }

        return true;
    }
}


