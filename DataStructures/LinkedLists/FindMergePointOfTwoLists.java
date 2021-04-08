

// Complete the findMergeNode function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        int count1= 0 ;
        int count2=0;
        int nodeValue= 0;
        SinglyLinkedListNode oldHead1 = head1;
        SinglyLinkedListNode oldHead2 = head2;

        while(head1!=null){
        count1 = count1 + 1;
        head1 = head1.next;
        }
        while(head2!=null){
        count2 = count2 + 1;
        head2 = head2.next;
        }

        if(count1> count2){
        int diff = count1-count2;
        for(int i=0;i< diff;i++){
        oldHead1 = oldHead1.next;
        }
        }else if(count1< count2){
        int diff = count2-count1;
        for(int j=0;j<diff;j++){
        oldHead2 = oldHead2.next;
        }
        }

        while(oldHead1!=null){
        if(oldHead1==oldHead2){
        nodeValue = oldHead1.data;
        break;
        }else{
        oldHead1 = oldHead1.next;
        oldHead2 = oldHead2.next;
        }
        }

        return nodeValue;


        }

