package offer.linkList;

/**
 *删除链表中的重复节点
 * */
public class _12DelRepeatListNode {
    public ListNode deleteRepeatListNode(ListNode listNode){
        if(listNode == null || listNode.next == null){
            return listNode;
        }
        ListNode head = new ListNode(-1);
        head.next = listNode;
        ListNode first = head;
        ListNode second = head.next;
        while (second != null){
            if(second.next != null && second.val == second.next.val){
                while (second.next != null && second.val == second.next.val){
                    second = second.next;
                }
                first.next = second.next;
            }else{
                first = first.next;
            }
            second = second.next;
        }
        return head.next;
    }
}
