public class q21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode dummyIterator = dummyHead;
        
        while(l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    dummyIterator.next = l1;
                    l1 = l1.next;
                } else {
                    dummyIterator.next = l2;
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                dummyIterator.next = l1;
                l1 = null;
            } else {
                dummyIterator.next = l2;
                l2 = null;
            }
            dummyIterator = dummyIterator.next;
        }
        
        return dummyHead.next;
    }
}
