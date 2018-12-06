package LinkedList;
// needs to be redone, does not seem right

// https://www.programcreek.com/2012/12/add-two-numbers/
public class AddTwoNumbers2 {


    public static void main(String[] args) {

        ListNode listNode3 = new ListNode(3);
        ListNode listNode2H = new ListNode(2, new ListNode(4, listNode3));

        ListNode listNode4 = new ListNode(4);
        ListNode listNode5H = new ListNode(5, new ListNode(6, listNode4));


        AddTwoNumbers2 addTwoNumbers2 = new AddTwoNumbers2();
        addTwoNumbers2.process(listNode2H, listNode5H);
    }





    public ListNode process(ListNode node1, ListNode node2){
        ListNode newHead = new ListNode(0);

        ListNode result = newHead;
        int carry = 0;
        while(node1!= null || node2 != null){
            if(node1 != null) {
                carry = carry + node1.value;
                node1 = node1.next;
            }

            if(node2 != null) {
                carry = carry + node2.value;
                node2 = node2.next;
            }

            result.next = new ListNode(carry%10);
            result = result.next;
            carry = carry/10;
        }

        if(carry ==1){
            result.next = new ListNode(1);
        }
        return newHead.next;
    }
}
