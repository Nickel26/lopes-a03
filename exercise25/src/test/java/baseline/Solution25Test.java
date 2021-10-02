package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    void text_passwordValidator(){
        Solution25 app = new Solution25();
        String testPass = "Chicken7";
        int expected = 2;
        int actual = app.passwordValidator(testPass);

        assertEquals(expected, actual);

    }

}