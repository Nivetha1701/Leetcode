public class Solution {
    public ListNode detectCycle(ListNode head) {

        HashSet<ListNode> set=new HashSet<>();
        ListNode curr=head;
        while(curr!=null)
        {
            if(set.contains(curr))
            {
                return curr;
            }
            set.add(curr);
            curr=curr.next;
        } 
        return null;
    }
}