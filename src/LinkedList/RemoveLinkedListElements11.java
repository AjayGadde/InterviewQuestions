package LinkedList;

public class RemoveLinkedListElements11 {


    public void process(ListNode head, int element){
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode helper = temp;
        while(helper.next != null){
            if(helper.next.value == element){
                ListNode p = helper.next;
                helper = p.next;
            }else{
                helper = helper.next;
            }
        }

// return head;



    }
}
