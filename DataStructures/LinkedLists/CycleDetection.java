

// Complete the hasCycle function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static boolean hasCycle(SinglyLinkedListNode head) {

        ArrayList<SinglyLinkedListNode> arrayList = new ArrayList<SinglyLinkedListNode>();

        boolean flag = false;

        if(head!=null){
        while(head.next!=null){

        for(SinglyLinkedListNode node: arrayList){
        if(head== node){
        flag = true;
        break;
        }
        }
        if(flag){
        break;
        }else{
        arrayList.add(head);
        head = head.next;
        }
        }
        return flag;
        }else{
        return flag;
        }


        }

