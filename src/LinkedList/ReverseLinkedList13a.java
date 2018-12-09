package LinkedList;



// https://www.geeksforgeeks.org/reverse-a-linked-list/
public class ReverseLinkedList13a {






    public ListNode reverseIterative(ListNode head){


        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;


        while(current!= null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        head = prev;
        return  head;

    }
}
