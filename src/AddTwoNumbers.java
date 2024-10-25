import datastructure.LinkedList;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class AddTwoNumbers {

    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        LinkedList<Integer> res = new LinkedList<>();
        int carry = 0;
        LinkedList<Integer> head = res;
        while (l1 != null && l2 != null) {
            int newValue = l1.getValue() + l2.getValue() + carry;
            if (newValue < 10) {
                res.setValue(newValue);
                carry = 0;
            } else {
                res.setValue(newValue % 10);
                carry = newValue / 10;
            }

            if (l1.getNext() == null || l2.getNext() == null) {
                break;
            }

            res.setNext(new LinkedList<>());
            res = res.getNext();
            l1 = l1.getNext();
            l2 = l2.getNext();
        }

        while (l1 != null ) {
            if (carry > 0) {
                int newValue = l1.getValue() + carry;
                if (newValue < 10) {
                    l1.setValue(newValue);
                } else {
                    l1.setValue(newValue % 10);
                    carry = newValue / 10;
                }
                res.setNext(l1);
            }
            l1 = l1.getNext();
        }

        while (l2 != null) {
            if (carry > 0) {
                int newValue = l2.getValue() + carry;
                if (newValue < 10) {
                    l2.setValue(newValue);
                } else {
                    l2.setValue(newValue % 10);
                    carry = newValue / 10;
                }
            }
            res.setNext(l2);
            l2 = l2.getNext();
        }

        if (carry > 0) {
            res.setNext(new LinkedList<>(carry));
        }
        return head;
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode dummyHead = new ListNode(0);
//        ListNode tail = dummyHead;
//        int carry = 0;
//
//        while (l1 != null || l2 != null || carry != 0) {
//            int digit1 = (l1 != null) ? l1.val : 0;
//            int digit2 = (l2 != null) ? l2.val : 0;
//
//            int sum = digit1 + digit2 + carry;
//            int digit = sum % 10;
//            carry = sum / 10;
//
//            ListNode newNode = new ListNode(digit);
//            tail.next = newNode;
//            tail = tail.next;
//
//            l1 = (l1 != null) ? l1.next : null;
//            l2 = (l2 != null) ? l2.next : null;
//        }
//
//        ListNode result = dummyHead.next;
//        dummyHead.next = null;
//        return result;
//    }

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>(7);
        LinkedList<Integer> l1_1 = new LinkedList<>(2);
        LinkedList<Integer> l1_2 = new LinkedList<>(1);
        l1.setNext(l1_1.setNext(l1_2));

        LinkedList<Integer> l2 = new LinkedList<>(3);
        LinkedList<Integer> l2_1 = new LinkedList<>(2);
        LinkedList<Integer> l2_2 = new LinkedList<>(1);
        LinkedList<Integer> l2_3 = new LinkedList<>(1);
        l2.setNext(l2_1.setNext(l2_2.setNext(l2_3)));

//        System.out.println(l1);

        System.out.println(addTwoNumbers(l1, l2));
    }

}
