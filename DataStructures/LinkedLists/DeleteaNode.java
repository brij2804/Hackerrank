

// Complete the deleteNode function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head,int position){

        if(head!=null){
            if(head.next!=null){
             if(position>0){
                SinglyLinkedListNode oldHead=head;
                for(int i=0;i<position-1;i++){
                head=head.next;
                }
                SinglyLinkedListNode deletedNode=head.next;
                head.next=deletedNode.next;
                return oldHead;
            }else{
                    SinglyLinkedListNode newHead=head.next;
                    head.next=null;
                    return newHead;
            }

        }else{
        return null;
        }
        }else{
        return null;
        }
        }

