

// Complete the getNode function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static int getNode(SinglyLinkedListNode head, int positionFromTail) {


        int count = 1;
        SinglyLinkedListNode oldHead = head;
        while(head.next!=null){
        count = count+1;
        head = head.next;
        }
        count = count- positionFromTail;
        for(int i=1 ;i<count;i++ ){
        oldHead = oldHead.next;
        }
        return oldHead.data;


        }

