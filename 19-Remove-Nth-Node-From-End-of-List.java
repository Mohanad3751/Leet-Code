/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size;
        ListNode node;
        for (size =0,node = head;node != null;size++,node=node.next);
        node = head;
        if (size == 1){
            head = null;
        }else if(size == n ){
            head = head.next;
        }
        else{
        for (int i =0 ;i!=(size-n)-1;i++) node=node.next;
        node.next=node.next.next;}

    return head;    
    }
}