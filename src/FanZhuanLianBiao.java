public class FanZhuanLianBiao {
    public ListNode reverseNode(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextStep = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextStep;
        }
        return prev;
    }
}
