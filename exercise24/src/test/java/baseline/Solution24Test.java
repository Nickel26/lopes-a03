package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    @Test
    public void test_isAnagram(){
        Solution24 app = new Solution24();
        String str1 = "chicken";
        String str2 = "tender";

        assertEquals(false, app.isAnagram(str1, str2));
    }

}