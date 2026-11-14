
class MyLinkedList {

    class LinkedNode {
        int val;
        LinkedNode next;

        LinkedNode(int val) {
            this.val = val;
        }
    }

    LinkedNode head;
    int size;

    public MyLinkedList() {
        head = new LinkedNode(0); // Dummy node
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        LinkedNode curr = head.next;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) {
            index = 0;
        }

        if (index > size) {
            return;
        }

        LinkedNode curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        LinkedNode newNode = new LinkedNode(val);

        newNode.next = curr.next;
        curr.next = newNode;

        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }

        LinkedNode curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        size--;
    }
}


/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */