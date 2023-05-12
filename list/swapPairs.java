public class swapPairs {
    public ListNode swappairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swappairs(head.next);
        next.next = head;
        return next;
    }
}
