

/*

class Node
    int data;
    Node left;
    Node right;
*/
public static void levelOrder(Node root) {

        Queue<Node> q= new LinkedList<Node>();
        q.add(root);

        while(!q.isEmpty()){
        Node tempNode = q.poll();
        System.out.print(tempNode.data+" ");
        if(tempNode.left!=null){
        q.add(tempNode.left);
        }
        if(tempNode.right!=null){
        q.add(tempNode.right);
        }
        }

        }

