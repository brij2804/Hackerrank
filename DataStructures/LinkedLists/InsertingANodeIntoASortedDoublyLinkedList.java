

// Complete the sortedInsert function below.

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
static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode oldHead = head;
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        if(head.data> data){
        newNode.next = head;
        head.prev = newNode;
        oldHead = newNode;
        return oldHead;
        }

        while(head!=null){

        if(head.data < data){
        if(head.next==null){
        head.next = newNode;
        newNode.prev = head;
        break;
        }
        }else{
        DoublyLinkedListNode prevNode = head.prev;
        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = head;
        head.prev = newNode;
        break;
        }
        head = head.next;
        }
        return oldHead;
        }

