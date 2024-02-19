package medium;

public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {
        ListNode root = new ListNode(1,new ListNode(2));
        root.next.next= new ListNode(3,new ListNode(4,new ListNode(5)));
        ListNode result=removeNthFromEnd(root,2);
        while(result!=null){
            System.out.print(result.val +"->");
            result = result.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head);
        ListNode left = dummy;
        ListNode right = head;
        while(n > 0 && right != null){
            right = right.next;
            n--;
        }
        while(right != null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }

}
