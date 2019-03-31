package offer.linkList;

/**
 * 判断两个无环链表是否相交
 * */
public class _15InterSection {

    public boolean isIntersection(ListNode headA, ListNode headB){
        if(null == headA || null == headB){
            return false;
        }
        if(headA == headB){
            return true;
        }
        while (null != headA.next){
            headA = headA.next;
        }
        while( null != headB.next){
            headB = headB.next;
        }
        return  headA == headB;
    }
}
