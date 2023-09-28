package SeptemberTree.thirdday;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode783 {
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
    public int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        Collections.sort(list);
        int cur = Integer.MAX_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            int ans = list.get(i + 1) - list.get(i);
            cur = Math.min(cur, ans);
        }


        return cur;
    }

    private void dfs(TreeNode root, List<Integer> list) {

        if (root == null) return;
        list.add(root.val);
        dfs(root.left, list);
        dfs(root.right, list);
    }
}
