public class ReverseNode {
    public static ListNode reverseNode(ListNode head){
        ListNode dummy = head;
        ListNode cur = null;
        while(dummy != null){
            ListNode nextS = dummy.next;
            dummy.next = cur;
            cur = dummy;
            dummy = nextS;
        }
        return cur;
    }
}
