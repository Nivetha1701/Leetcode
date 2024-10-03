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
    public ListNode swapNodes(ListNode head, int k) {
   
        ListNode first = head, second = head,temp=head;
        int size=0;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        for (int i=1;i<k;i++) 
        {
            first=first.next;  
        }
        for(int i=1;i<=(size-k);i++)
        {
            second=second.next;
        }

        int swapValue=first.val;
        first.val=second.val;
        second.val=swapValue;

        return head;
    }
}
