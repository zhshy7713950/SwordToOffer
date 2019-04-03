package zsy.swordtooffer.question4;

public class ListNode {

    private int key;
    private ListNode nextNode;

    public ListNode() {
    }

    public ListNode(int key, ListNode nextNode) {
        this.key = key;
        this.nextNode = nextNode;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }
}
