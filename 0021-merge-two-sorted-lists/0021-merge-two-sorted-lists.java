
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        ListNode p1=list1;
        ListNode p2=list2;
        while(p1!=null && p2!=null)
        {
            if(p1.val<p2.val)
            {
                temp.next=p1;
                temp=p1;
                p1=p1.next;
            }
            else 
            {
                temp.next=p2;
                temp=p2;
                p2=p2.next;
            }
        }
        if(p1!=null)
        {
            temp.next=p1;
        }
        else 
        {
            temp.next=p2;
        }
        return dummy.next;
    }
}