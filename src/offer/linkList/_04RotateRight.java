package offer.linkList;

/**
 * 旋转单链表
 * */
public class _04RotateRight {
    public ListNode rotateRight(ListNode head ,int k){
        if(head == null)
            return null;
        int n = 1;
        ListNode cur = head;
        while(cur.next != null){
            ++n;
            cur  = cur.next;
        }
        cur.next = head;
        int m = n - k % n;
        for(int i = 0; i<m; i++){
            cur = cur.next;
        }
        ListNode newHead = cur.next;
        cur.next = null;
        return newHead;
    }
}
