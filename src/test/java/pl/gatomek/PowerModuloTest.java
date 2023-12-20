package pl.gatomek;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PowerModuloTest {

    @ParameterizedTest
    @CsvSource({
        "5,1,19,5",
        "5,2,19,6",
        "5,3,19,11",
    })
    void shouldCalculateTest( long base, long exponent, long modulo, long expected) {
        long result = PowerModulo.calc( base, exponent, modulo);
        assertEquals( result, expected);
    }
}
