package offer.linkList;

/**
 * 划分链表使得所有小于x的节点排在大于等于x的节点之前
 * */
public class _07Partition {
    public ListNode partition(ListNode head, int x){
        if(head == null){
            return null;
        }
        ListNode leftStart = new ListNode(0);
        ListNode rightStart = new ListNode(0);

        ListNode left = leftStart,right = rightStart;

        while(head != null){
            if(head.val < x){
                left.next = left;
                left = head;
            }else{
                right.next = right;
                right = head;
        }
        }
        right.next = null;
        left.next = rightStart.next;
        return leftStart.next;
    }
}
