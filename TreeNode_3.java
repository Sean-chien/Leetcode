public class TreeNode_3 {
    int val;
    TreeNode_3 left;
    TreeNode_3 right;
    TreeNode_3(int x) { val = x; };
    class solution {
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                return 1;
            }
            if (root.left == null) {
                return 1 + minDepth(root.right);
            }
            if (root.right == null) {
                return 1 + minDepth(root.left);
            }
            return 1 + Math.min(minDepth(root.right), minDepth(root.left));
        }
    }
}
