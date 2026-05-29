// https://leetcode.com/problems/merge-two-sorted-lists/?envType=problem-list-v2&envId=oizxjoit
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

public class MergeTwoSortedList_21 {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode();
        ListNode tail = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        return dummyNode.next;
    }
}
