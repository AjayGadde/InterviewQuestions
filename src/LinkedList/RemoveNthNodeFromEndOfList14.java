package LinkedList;

public class RemoveNthNodeFromEndOfList14 {










    public void process(ListNode head, int N){

        ListNode fast = head;
        ListNode slow = head;

        int i = 1;
        while(i<=N){
            fast = fast.next;
            i++;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

    }
}
