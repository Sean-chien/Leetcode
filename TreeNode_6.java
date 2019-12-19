public class TreeNode_6 {
    int val;
    TreeNode_6 left;
    TreeNode_6 right;
    TreeNode_6(int x) { val = x; }
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.right == null && root.left == null && sum - root.val == 0) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}
