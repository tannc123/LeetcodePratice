package offer.linkList;

import java.util.ArrayList;

/**
 * 链表反转
 * */
public class _02PrintListFromTailToHead {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        if(listNode == null){
            return new ArrayList<Integer>();
        }
        ListNode head = listNode;
        ListNode cur = head.next;
        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = head;
            head = cur;
            cur = tmp;
        }
        //此时listNode的next还指向第二个node，所以要让listNode.next=null,防止循环
        listNode.next = null;
        ArrayList<Integer> res = new ArrayList<>();
        while (head != null){
            res.add(head.val);
            head = head.next;
        }
        return res;
    }

}
