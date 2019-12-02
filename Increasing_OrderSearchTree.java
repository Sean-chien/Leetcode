import javax.swing.tree.TreeNode;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right; **/
public class Increasing_OrderSearchTree {
    TreeNode result = new TreeNode(0);
    TreeNode temp = result;
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return root;
        }
        if (root.left != null) {
            increasingBST(root.left);
        }
        temp.right = new TreeNode(root.val);
        temp = temp.right;
        if (root.right != null) {
            increasingBST(root.right);
        }
        return result.right;
    }
}
