/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
       if (head == null || head.next == null) {
           return head;
       }
       ListNode prev = null;
       ListNode cur = head;
       ListNode next = cur.next;
       while(next != null) {
           cur.next = prev;
           prev = cur;
           cur = next;
           next = cur.next;
       }
       cur.next = prev;
       return cur;
    }
}
