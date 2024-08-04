package ou.task206;

import org.junit.jupiter.api.Test;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        solution.reverseList(head);
    }
}
