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
    public ListNode deleteDuplicates(ListNode head) {
        for (int i =0; i<4;i++){
        ListNode node =head;
        while (node != null && node.next !=null){
            if (node.val == node.next.val){
                node.next=node.next.next;
            }
            node= node.next;
        }}
        return head;
    }
}