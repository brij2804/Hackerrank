

// Complete the insertNodeAtTail function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        if(head!=null){
        SinglyLinkedListNode oldHead = head;
        while(head.next!=null){
        head = head.next;
        }
        SinglyLinkedListNode tail = new SinglyLinkedListNode(data);
        head.next = tail;
        return oldHead;
        }else{
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
        return newHead;
        }
        }

