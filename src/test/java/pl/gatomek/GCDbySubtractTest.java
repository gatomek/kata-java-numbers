package pl.gatomek;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class GCDbySubtractTest {

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "0,1",
            "1,0",
            "-1,1"
    })
    void shouldThrowExceptionTest( long a, long b) {
        assertThrows( ArithmeticException.class, () -> GCDbySubtract.calc(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "1,1,1",
            "2,1,1",
            "1,2,1",
            "2,2,2",
            "10,2,2",
            "16,7,1",
            "25,15,5"
    })
    void shouldCalculateTest( long a, long b, long expected) {
        assertEquals( GCDbySubtract.calc(a,b ), expected);
    }
}
