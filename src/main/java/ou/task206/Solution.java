package ou.task206;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        List<ListNode> nodes = new ArrayList<>();
        while (head != null)
        {
            nodes.add(head);
            head = head.next;
        }
        Collections.reverse(nodes);
        ListNode newHead = new ListNode(nodes.get(0).val);
        ListNode result = newHead;
        for (int i = 1; i < nodes.size(); i++) {
            newHead.next = new ListNode(nodes.get(i).val);
            newHead = newHead.next;
        }
        return result;
    }
}
