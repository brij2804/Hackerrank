

// Complete the printLinkedList function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static void printLinkedList(SinglyLinkedListNode head) {

        if(head != null){
        System.out.println(head.data);
        }
        while(head.next !=null){
        head = head.next;
        System.out.println(head.data);
        }

        }

