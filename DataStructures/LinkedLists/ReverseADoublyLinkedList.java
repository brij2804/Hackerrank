

// Complete the reverse function below.

/*
 * For your reference:
 *
 * DoublyLinkedListNode {
 *     int data;
 *     DoublyLinkedListNode next;
 *     DoublyLinkedListNode prev;
 * }
 *
 */
static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

        DoublyLinkedListNode temp = null;
        DoublyLinkedListNode current= head;

        while(current!=null){
        temp = current.prev;
        current.prev = current.next;
        current.next = temp;
        current = current.prev;
        }
        if(temp!=null){
        head =temp.prev;
        }

        return head;
        }

