package ou.task703;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    KthLargest kthLargest = new KthLargest(3, new int[]{ 4, 5, 8, 2 });

    @Test
    public void test_1() {
        assertEquals(4, kthLargest.add(3));
    }

    @Test
    public void test_2() {
        assertEquals(5, kthLargest.add(5));
    }

    @Test
    public void test_3() {
        assertEquals(5, kthLargest.add(10));
    }

}
