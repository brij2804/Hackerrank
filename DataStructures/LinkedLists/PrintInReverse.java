

// Complete the reversePrint function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static void reversePrint(SinglyLinkedListNode head) {

        if(head!=null){
        if(head.next!=null){
        reversePrint(head.next);
        System.out.println(head.data);
        }else{
        System.out.println(head.data);
        }
        }
        }

