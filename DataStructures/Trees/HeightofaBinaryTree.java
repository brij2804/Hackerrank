

/*
class Node
    int data;
    Node left;
    Node right;
*/
public static int height(Node root) {
        // Write your code here.

        int dept= depth(root);
        return dept-1;

        }

public static int depth(Node root){
        if(root == null){
        return 0;
        }else{
        int ldepth = depth(root.left);
        int rdepth = depth(root.right);
        if(ldepth > rdepth){
        return(ldepth+1);
        }else{
        return(rdepth+1);
        }
        }
        }



