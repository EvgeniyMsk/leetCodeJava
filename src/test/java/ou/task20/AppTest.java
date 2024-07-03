package ou.task20;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    static Solution solution;

    @BeforeAll
    static public void init() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(solution.isValid("()"), true);
    }
}
