import datastructure.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeSortedLists {

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode newNode = new ListNode(0);
        ListNode head = newNode;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            newNode.next = new ListNode(node.val);
            newNode = newNode.next;
            if (node.next != null) {
                pq.add(node.next);
            }
        }

        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(3);

        ListNode l3= new ListNode(1);
        l3.next = new ListNode(2);
        l3.next.next = new ListNode(3);

        System.out.println(mergeKLists(new ListNode[]{l1,l2,l3}).toString());
    }
}
