package LinkedList;

public class OddEvenLinkedList6 {



    public ListNode process(ListNode head){

        ListNode result = head;
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode connectNode = head.next;

        while (p1!= null && p2 != null) {

            p1.next = p2.next;
            p1 = p1.next;
            p2.next = p1.next;
            p2 = p2.next;
        }

        p1.next = connectNode;
        return result;


    }




}
