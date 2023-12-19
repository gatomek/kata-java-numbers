package pl.gatomek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDTest {

    @Test
    void GCD1() {
        assertThrows( ArithmeticException.class, () -> GCD.bySubstracting(0,0 ));
    }
    @Test
    void GCD2() {
        assertThrows( ArithmeticException.class, () -> GCD.bySubstracting(0,1 ));
    }
    @Test
    void GCD3() {
        assertThrows( ArithmeticException.class, () -> GCD.bySubstracting(1,0 ));
    }

    @Test
    void GCD4() {
        assertThrows( ArithmeticException.class, () -> GCD.bySubstracting(-1,1 ));
    }

    @Test
    void GCD5() {
        assertEquals( GCD.bySubstracting(1,1 ), 1);
    }

    @Test
    void GCD6() {
        assertEquals( GCD.bySubstracting( 2,1 ), 1);
    }

    @Test
    void GCD7() {
        assertEquals( GCD.bySubstracting( 1,2 ), 1);
    }

    @Test
    void GCD8() {
        assertEquals( GCD.bySubstracting( 2,2 ), 2);
    }

    @Test
    void GCD9() {
        assertEquals( GCD.bySubstracting( 10,2 ), 2);
    }

    @Test
    void GCD10() {
        assertEquals( GCD.bySubstracting( 16,7 ), 1);
    }

    @Test
    void GCD11() {
        assertEquals( GCD.bySubstracting( 25,15 ), 5);
    }
}
