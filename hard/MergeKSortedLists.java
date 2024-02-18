package hard;

public class MergeKSortedLists {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next =new ListNode(4);
        list1.next.next =new ListNode(5);

        ListNode list2 = new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);

        ListNode list3 = new ListNode(2);
        list3.next=new ListNode(6);

        ListNode[] lists = new ListNode[]{list1,list2,list3};
        ListNode result = mergeKLists(lists);
        while(result!= null){
            System.out.print(result.val+" ");
            result = result.next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;

        int interval=1;
        while(interval<lists.length){
            for(int i=0;i+interval<lists.length;i=i+interval*2)
                lists[i]=mergeTwoLists(lists[i],lists[i+interval]);
            interval*=2;
        }
        return lists[0];

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
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
