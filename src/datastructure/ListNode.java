package datastructure;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        ListNode cur = this;
        StringBuilder sb = new StringBuilder();
        while (cur != null) {
            sb.append(cur.val);
            sb.append("->");
            cur = cur.next;
        }
        return sb.toString() + "NULL";
    }
}
