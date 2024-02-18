package easy;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2,new ListNode(4));

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3,new ListNode(4));

        ListNode result = mergeTwoLists(list1,list2);
        while(result != null){
            System.out.print(result.val+ " ");
            result = result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode tail = result;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                tail.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                tail.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            tail = tail.next;
        }
        if( list1 != null ){
            tail.next = list1;
        } else if (list2 != null) {
            tail.next = list2;
        }

        return result.next;
    }

}
