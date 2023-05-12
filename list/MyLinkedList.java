/*
class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
}
*/


class MyLinkedList {
    // size存储节点个数
    int size;
    // 虚拟头节点
    ListNode head;

    // 初始化链表
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    // 获取链表中下表为index的节点的值，如果下标无效，则返回-1
    public int get(int index) {
        // 如果index不合法，返回-1
        if (index < 0 || index >= size){
            return -1;
        }
        ListNode currentNode = head;
        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }

    // 将一个值为val 的节点插入到链表中第一个元素之前。在插入完成后，新节点会成为链表的第一个节点
    public void  addAtHead(int val) {
//        ListNode cre = head;
//        ListNode prenode = new ListNode(val);
//        prenode.next = cre;
//        head = prenode;
        addAtIndex(0,val);
    }

    // 将一个值为 val 的节点追加到链表中作为链表的最后一个元素。
    public void addAtTail(int val) {
        ListNode pre = head;
        for (int i = 0; i < size; i++) {
            pre = pre.next;
        }
        ListNode addNode = new ListNode(val);
        pre.next = addNode;
        //addAtIndex(size,val);
    }

    //  将一个值为 val 的节点插入到链表中下标为 index 的节点之前。如果 index 等于链表的长度，那么该节点会被追加到链表的末尾。
    //  如果 index 比长度更大，该节点将 不会插入 到链表中

    public void addAtIndex(int index, int val) {
        // 判断数据合法
        if (index > size){
            return;
        }
        if (index < 0){
            index = 0;
        }
        size++;
        // 找到要查入结点的前驱
        ListNode pre = head;
        for (int i = 0; i < index; i++){
            pre = pre.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = pre.next;
        pre.next = toAdd;
    }

    // 如果下标有效，则删除链表中下标为 index 的节点。
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size){
            return;
        }
        if (index == 0){
            head = head.next;
            return;
        }
        ListNode currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
            if (index == size - 1){
                currentNode.next = null;
            }else {
                currentNode.next = currentNode.next.next;
            }
        }
    }
}
