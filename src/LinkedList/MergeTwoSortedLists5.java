package LinkedList;

public class MergeTwoSortedLists5 {





    public ListNode merge(ListNode head1, ListNode head2){

        ListNode fake = new ListNode(0);
        ListNode prev = fake;

        while(head1 != null || head2 != null ){

            if(head1 != null && head2 != null){
                if(head1.value < head2.value){
                    prev.next = head1;
                    prev = head1;
                    head1 = head1.next;
                }else if(head2.value > head1.value) {
                    prev.next = head2;
                    prev = head2;
                    head2 = head2.next;
                }
                }else if(head2 != null){
                    prev.next = head2;
                    break;

                }else if(head1 != null){
                    prev.next = head1;
                    break;
                }


            }
        return fake.next;

        }



}
