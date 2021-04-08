

// Complete the compareLists function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        boolean flag = false;

        while(head1!=null && head2!=null){
        if(head1.data == head2.data){
        head1= head1.next;
        head2 = head2.next;
        flag = true;
        }else{
        flag = false;
        break;
        }
        }
        if(head1==null && head2!=null){
        flag = false;
        }
        if(head1!=null && head2==null){
        flag = false;
        }

        return flag;

        }

