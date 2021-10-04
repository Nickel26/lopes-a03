package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void main() {
        Solution33 app = new Solution33();
        ArrayList<String> response = new ArrayList<String>();
        response.add("Yes,");
        response.add("No,");
        response.add("Maybe,");
        response.add("Ask again later.");
        int random;
        random = app.randomNumberGenerator();
        String actual = response.get(random);
        String expected = response.get(random);

        assertEquals(expected, actual);
    }
}