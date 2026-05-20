
// https://leetcode.com/problems/linked-list-cycle/description/?envType=problem-list-v2&envId=oizxjoit
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int x) {
        val = x;
    }
}

public class LinkListCycle_141 {
    public static void main(String[] args) {
        
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

}