// https://leetcode.com/problems/reorder-list/?envType=problem-list-v2&envId=oizxjoit
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class ReorderList_143 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        // reorderList();
    }

    public void reorderList(ListNode head) {
        if (head == null && head.next == null) {
            return;
        }
        ListNode middle = getMiddle(head);
        ListNode secondHalf = splitLL(middle);
        ListNode reverse = reverseLL(secondHalf);
        mergeLL(head, reverse);
    }

    // find the middle
    ListNode getMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // split from middle
    ListNode splitLL(ListNode middle) {
        ListNode secondHalf = middle.next;
        middle.next = null;
        return secondHalf;
    }

    // reverse the LL
    ListNode reverseLL(ListNode curr) {
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // reverse the LL
    void mergeLL(ListNode first, ListNode second) {
        while (second != null) {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            first.next = second;
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }
    }
}
