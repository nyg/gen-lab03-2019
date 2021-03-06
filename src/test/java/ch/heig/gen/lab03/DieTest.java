package ch.heig.gen.lab03;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DieTest {

    @RepeatedTest(100)
    public void testRangeDice() {
        Die d1 = new Die();
        d1.roll();
        assertTrue(d1.getFaceValue() <= 6 && d1.getFaceValue() >= 1);
    }
}
