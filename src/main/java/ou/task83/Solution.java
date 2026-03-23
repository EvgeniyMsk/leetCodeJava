package ou.task83;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;

        while (current.next != null) {
            if (current.val == current.next.val) {
                // Пропускаем дубликат
                current.next = current.next.next;
            } else {
                // Переходим к следующему узлу
                current = current.next;
            }
        }

        return head;
    }
}
