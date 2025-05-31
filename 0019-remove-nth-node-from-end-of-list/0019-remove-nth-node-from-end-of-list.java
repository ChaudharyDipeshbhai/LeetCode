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
        // ListNode temp = head;
        // if (head.next == null){
        //     return null;
        // }
        // int rear = 0-n;
        // ListNode del = head;
        // while(temp.next!= null){
        //     temp = temp.next;
        //     rear ++;
        //     if(rear >0){
        //         del = del.next;
        //     }
            
        // }
        // del.next = del.next.next;
            
        // return head;
    ListNode list = new ListNode(0,head);
    ListNode first = list;
    ListNode second = list;
    for(int i=0; i<n; i++){
        first = first.next;
    }
    while(first.next != null){
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
    return list.next;
    }
}