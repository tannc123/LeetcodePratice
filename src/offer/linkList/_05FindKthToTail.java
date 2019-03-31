package offer.linkList;

/**
 * 查到倒数第K个链表节点
 * */
public class _05FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k){
        if(head == null || k == 0){
            return  null;
        }
        ListNode temp = head;
        //判断K是否超过链表节点个数
        for(int i = 0; i<k-1; i++){
            if(temp.next != null) {
                temp = temp.next;
            }else{
                return null;
            }
        }
        ListNode pA = head;
        ListNode pB = head;
        for(int i =0; i<k-1; i++){
            pA = pA.next;
        }
        while(pA.next != null){
            pA = pA.next;
            pB = pB.next;
        }
        return pB;
    }

}
