package ou.task21;

import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        ListNode current = this;

        while (current.next != null && listNode.next != null) {
            current = current.next;
            listNode = listNode.next;
            if (current.val != listNode.val)
                return false;
        }
        return (current.next == null && listNode.next == null && (current.val == listNode.val));
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }
}
