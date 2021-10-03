package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void main() {
        Solution31 app = new Solution31();

        double expectedHeartRate = 151;
        double actual;
        double i = 0.65;
        double age = 22;
        double restingPulse = 65;

        actual = app.karvonenHeartRate(age, restingPulse, i);
        assertEquals(expectedHeartRate, actual);

    }
}