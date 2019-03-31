package offer.linkList;

/**
 * 合并有序链表
 * */
public class _10MergeListNode {

    /**
     * 递归解法
     * */
    public ListNode deMerge(ListNode list1, ListNode list2){
        if(list1 == null)
            return list2;
        if(list2 == null)
            return list1;
        ListNode mergeHead = null;
        if(list1.val <= list2.val){
            mergeHead = list1;
            mergeHead.next = deMerge(list1, list2);
        }else{
            mergeHead = list2;
            mergeHead.next = deMerge(list1, list2);
        }
        return mergeHead;
    }

    /**
     * 非递归解法
     * */
    public ListNode notDeMerge(ListNode list1, ListNode list2){
        if(list1 == null)
            return list2;
        else if(list2 == null)
            return list1;
        ListNode mergerHead = null;
        if(list1.val <= list2.val) {
            mergerHead = list1;
            list1 = list1.next;
        }else{
            mergerHead = list2;
            list2 = list2.next;
        }
        ListNode cur = mergerHead;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1 == null){
            cur.next = list2;
        }else if(list2 == null){
            cur.next = list1;
        }
        return mergerHead;
    }
}
