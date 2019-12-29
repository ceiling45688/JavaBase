package LeetCodePrac;
/** Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.*/
public class MergeTwoSortedLists {
//    学习的leetcode官方递归解法，设定一个哨兵节点prehead，维护prev指针，
//    需要做的是调整它的next指针。。。其实我没太明白list

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;

        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        //因为 l1或者 l2 在该点上非空，所以连接。该非空集合连接到合并列表的末尾。
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){ val = x; }
}
