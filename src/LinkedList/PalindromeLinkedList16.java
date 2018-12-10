package LinkedList;

public class PalindromeLinkedList16 {



    public boolean PalindromeLinkedList16(ListNode head){

        ListNode fast = head;
        ListNode slow = head;


// find middle element
        while(fast.next != null && fast.next.next != null){

            fast = fast.next.next;
            slow = slow.next;
        }

 ListNode secondHead = slow.next;

        ListNode prev = null;
        ListNode current = slow.next;
        ListNode next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        secondHead = prev;


//        while(head)
//            secondHead = secondHead.next;
//            head = head.next;
//        }
//
return false;

    }







}
