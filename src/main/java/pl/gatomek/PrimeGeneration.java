package pl.gatomek;

import java.math.BigInteger;
import java.util.Random;

public class PrimeGeneration {
    public static void main(String[] args) {
        System.out.println("Prime Generation");
        BigInteger prime0 = BigInteger.probablePrime(1024, new Random());

        for( int i = 0; i < 101; i ++) {
            boolean probablePrime = prime0.isProbablePrime(i);
            System.out.println("" + i + ": " + probablePrime);
        }
    }
}