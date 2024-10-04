class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)
        {
            return null;
        }
        ListNode mergedList=lists[0];
        for(int i=1;i<lists.length;i++)
        {
            mergedList=mergeTwoLists(mergedList,lists[i]);
        }
        return mergedList;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(list1!=null && list2!=null) 
        {
            if (list1.val<list2.val) 
            {
                temp.next=list1;
                list1=list1.next;
            } 
            else 
            {
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null) 
        {
            temp.next=list1;
        } 
        else
        {
            temp.next=list2;
        }
        return dummy.next;
    }
}