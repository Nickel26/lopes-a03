package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    @Test
    void main() {
        Solution29 app = new Solution29();
        double years = 4;
        int actual;
        int expected = 18;

        actual = app.howManyYears(years);

        assertEquals(expected, actual);
    }

}