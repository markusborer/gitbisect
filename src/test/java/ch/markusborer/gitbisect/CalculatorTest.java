package ch.markusborer.gitbisect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        assertEquals(4, Calculator.sum(1, 3));
    }

    @Test
    void diff() {
        assertEquals(4, Calculator.diff(7, 3));
    }

}