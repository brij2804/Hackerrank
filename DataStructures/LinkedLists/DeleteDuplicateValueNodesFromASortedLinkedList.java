

// Complete the removeDuplicates function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

        SinglyLinkedListNode oldHead= head;

        if(head.next!=null){

        while(head.next!=null){

        if(head.data == head.next.data){

        SinglyLinkedListNode onestepahead = head.next.next;
        head.next = null;
        head.next = onestepahead;

        }else{
        head = head.next;
        }



        }

        return oldHead;
        }else{
        return oldHead;
        }



        }

