package SeptemberTree.thirdday;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeetCode230 {

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

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        Collections.sort(list);
        return list.get(k-1);
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root != null) {
            return;
        }
        list.add(root.val);

        dfs(root.left, list);
        dfs(root.right, list);
    }
}
