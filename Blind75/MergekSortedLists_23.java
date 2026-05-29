// https://leetcode.com/problems/merge-k-sorted-lists/?envType=problem-list-v2&envId=oizxjoit

import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
    }

    ListNode(int x) {
        val = x;
    }
}

public class MergekSortedLists_23 {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> qu = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode dummyNode = new ListNode();
        ListNode tail = dummyNode;

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                qu.add(lists[i]);
            }
        }

        while (!qu.isEmpty()) {
            ListNode smallest = qu.poll();
            tail.next = smallest;
            tail = tail.next;
            if (smallest.next != null) {
                qu.offer(smallest.next);
            }
        }

        return tail.next;
    }
}
