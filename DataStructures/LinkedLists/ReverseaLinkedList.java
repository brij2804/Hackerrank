

// Complete the reverse function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

        if(head!=null){
        SinglyLinkedListNode mainHead = head;
        while(mainHead.next!=null){
        mainHead = mainHead.next;
        }
        System.out.println(mainHead.data);
        subReverse(head);

        return mainHead;
        }else{
        return null;
        }

        }

static SinglyLinkedListNode subReverse(SinglyLinkedListNode head){

        if(head.next!=null){
        SinglyLinkedListNode newNode= subReverse(head.next);
        newNode.next= head;
        head.next = null;
        //System.out.println(head.data);
        return head;
        }else{
        //System.out.println(head.data);
        return head;
        }
        }

