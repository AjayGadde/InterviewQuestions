package LinkedList;

public class RemoveDuplicatesFromSortedList7a {




    public ListNode process(ListNode head){

        ListNode prev = head;
        ListNode p1 = head.next;
        while(p1 != null){
            if(p1.value == prev.value){
                prev.next = p1.next;
            }else {
                prev = p1;
                p1 = p1.next;
            }
        }

    return head;


    }

}
