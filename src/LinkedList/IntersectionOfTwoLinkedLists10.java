package LinkedList;

public class IntersectionOfTwoLinkedLists10 {



    public ListNode process(ListNode head1, ListNode head2){

        int l1=0;
        ListNode temp1 = head1;

        while(temp1!= null){
            l1++;
            temp1 = temp1.next;
        }


        int l2 = 0;
        ListNode temp2 = head2;
        while(temp2 != null){
            l2++;
            temp2 = temp2.next;
        }


        if(l1>l2){
            int n1 = l1-l2;
            for(int i =1; i<=n1; i++){
                head1 = head1.next;
            }
        }else {
            int n2 = l2-l1;
            for(int j=1; j< n2; j++){
                head2 = head2.next;
            }
        }

        while(head1 != null && head2 != null){

            if(head1 == head2){
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

return null;

    }

}
