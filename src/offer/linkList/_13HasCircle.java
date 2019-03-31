package offer.linkList;

/**
 * 判断单链表是否有环(快慢指针)
 * */
public class _13HasCircle {

    public boolean hasCycle(ListNode head){
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
                return  true;
        }
        return false;
    }
}
