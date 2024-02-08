package medium;

import java.util.Arrays;

public class AddTwoNumbers2 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        ListNode result = addTwoNumbers(l1,l2);
        while(result!=null){
            System.out.print(result.val);
            result = result.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_head = new ListNode(0);
        ListNode current = dummy_head;
        int carry = 0;
        while(l1 !=null || l2!=null || carry != 0){
            int l1_val = l1 != null ? l1.val :0;
            int l2_val = l2 != null ? l2.val :0;

            int sum = l1_val+ l2_val + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if(l1 != null ) l1 = l1.next;
            if(l2 != null ) l2 = l2.next;
        }
        return dummy_head.next;
    }

}
