

// Complete the insertNodeAtHead function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {

        if(head!=null){
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
        newHead.next = head;
        return newHead;
        }else{
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
        return newHead;
        }
        }

