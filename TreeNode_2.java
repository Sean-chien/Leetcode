public class TreeNode_2 {
    int val;
    TreeNode_2 left;
    TreeNode_2 right;
    TreeNode_2(int x) { val = x; }
    class solution {
        public int maxDepth(TreeNode_2 root) {
            if (root == null) {
                return 0;
            }
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);

            return 1 + Math.max(left,right);
        }
    }
}

