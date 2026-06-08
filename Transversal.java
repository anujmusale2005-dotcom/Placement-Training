// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}


class BinaryTreeDFS {

    
    public void dfsPreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " "); 
        dfsPreOrder(root.left);           
        dfsPreOrder(root.right);          
    }

    
    public void dfsInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        dfsInOrder(root.left);            
        System.out.print(root.val + " "); 
        dfsInOrder(root.right);           
    }

    
    public void dfsPostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        dfsPostOrder(root.left);           
        dfsPostOrder(root.right);          
        System.out.print(root.val + " ");  
    }
}


public class Transversal {
    public static void main(String[] args) {
        BinaryTreeDFS tree = new BinaryTreeDFS();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        
        System.out.println("Pre-order DFS (Root -> Left -> Right):");
        tree.dfsPreOrder(root); 
        System.out.println("\n");

        System.out.println("In-order DFS (Left -> Root -> Right):");
        tree.dfsInOrder(root);  
        System.out.println("\n");

        System.out.println("Post-order DFS (Left -> Right -> Root):");
        tree.dfsPostOrder(root); 
        System.out.println();
    }
}