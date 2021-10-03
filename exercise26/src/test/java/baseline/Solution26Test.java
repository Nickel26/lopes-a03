package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test {
    @Test
    public static void main(String[] args) {

        PaymentCalculator app = new PaymentCalculator();
        double i = 12;
        double expected_n = 70;
        double n;
        double b = 5000;
        double p = 100;

        n = app.calculateMonthsUntilPaidOff();

        assertEquals(expected_n, n);
    }
}