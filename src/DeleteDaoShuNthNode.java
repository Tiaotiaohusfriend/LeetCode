import java.util.List;

public class DeleteDaoShuNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int len = getLength(head);
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        for(int i=0; i<len-n;i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }
    private static int getLength(ListNode head){
        int len = 0;
        while(head != null){
            len ++;
            head = head.next;
        }
        return len;
    }
}
