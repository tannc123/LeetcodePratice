package offer.linkList;

public class _06FindMiddleNode {
    public ListNode findMiddleNode(ListNode head){
        if(null == head)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while(null != fast && null != fast.next){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
