class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(-1);
        ListNode head2=head;
        while (l1!=null && l2!=null)
        {
            if(l1.val<l2.val) {
                head.next = new ListNode(l1.val);
                l1=l1.next;
            }
            else
            {
                head.next = new ListNode(l2.val);
                l2=l2.next;
            }
            head=head.next;
        }
        if(l1!=null)
            head.next=l1;
        else
            head.next=l2;
        return head2.next;
    }
}
