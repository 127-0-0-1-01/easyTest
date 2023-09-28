package SeptemberTree.thirdday;



public class LeetCode230_1 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int k, ans;
    public int kthSmallest(TreeNode root, int _k) {
        k = _k;
        dfs(root);
        return ans;
    }
    void dfs(TreeNode root) {
        if (root == null || k <= 0) return ;
        dfs(root.left);
        if (--k == 0) ans = root.val;
        dfs(root.right);
    }
}
