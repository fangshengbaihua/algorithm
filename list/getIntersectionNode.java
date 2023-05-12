public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0,lenB = 0;
        while (curA != null){
            lenA++;
            curA = curA.next;
        }
        while (curB != null){
            lenB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;

        if (lenB > lenA) {
            int temp = lenA;
            lenA = lenB;
            lenB = temp;

            ListNode tempNode = curA;
            curA = curB;
            curB = tempNode;
        }

        int gap = lenA - lenB;

        while (gap-- > 0) {
            curA = curA.next;
        }

        while (curA != null) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;
    }

}
