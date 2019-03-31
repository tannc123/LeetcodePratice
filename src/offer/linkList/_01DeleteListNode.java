package offer.linkList;

public class _01DeleteListNode {
    /**
     * O(1)时间删除链表节点
     * */
    public static ListNode deleteNode(ListNode head , ListNode toBeDelted){
        if(head == null || toBeDelted == null){
            return head;
        }
        if(head == toBeDelted){
            return head.next;
        }
        if(toBeDelted.next == null){
            ListNode tmp = head;
            while (tmp.next != toBeDelted){
                tmp = tmp.next;
            }
            tmp.next = null;
        }else{
            toBeDelted.val = toBeDelted.next.val;
            toBeDelted.next = toBeDelted.next.next;
        }
        return head;
    }
}
