public class reverselist {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = null;
         while (cur != null) {
             temp = cur.next;
             cur.next = prev;
             prev = cur;
             cur = temp;
         }
         return prev;
    }
}
