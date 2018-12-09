package LinkedList;

public class SwapNodesInPairs12 {





    public ListNode process(ListNode head){

        ListNode tempH = new ListNode(0);

        tempH.next = head;


        ListNode p1 = tempH.next;
        ListNode p2 = tempH.next.next;

        ListNode pre = tempH;
        while(p1 != null && p2 != null) {
            tempH.next = p2;
            ListNode temp = p2.next;
            p2.next = p1;
            p1.next = temp;

            tempH = p1;
            p1 = p1.next;

            if (temp != null) {
                p2 = temp.next;
            }
        }






        return tempH;


    }
}
