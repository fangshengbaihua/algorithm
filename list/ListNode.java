public class ListNode {
    // 节点的值
    int val;

    // 下一个结点
    ListNode next;

    // 节点的构造函数（无参）
    public ListNode(){

    }

    // 节点的的构造函数（1个参数）
    public ListNode(int val) {
        this.val = val;
    }

    // 节点的构造函数（2个参数）
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
