package SeptemberTree.firstday;

import java.util.ArrayDeque;
import java.util.Deque;

public class Easy623 {


    /**
     * @param root
     * @param val
     * @param depth
     * @return
     */
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        //如果深度是
        if (depth == 1) return new TreeNode(val, root, null);
        Deque<TreeNode> d = new ArrayDeque<>();
        d.addLast(root);
        int cur = 1;
        while (!d.isEmpty()) {
            int sz = d.size();
            while (sz-- > 0) {
                TreeNode t = d.pollFirst();
                if (cur == depth - 1) {
                    TreeNode a = new TreeNode(val), b = new TreeNode(val);
                    a.left = t.left; b.right = t.right;
                    t.left = a; t.right = b;
                } else {
                    if (t.left != null) d.addLast(t.left);
                    if (t.right != null) d.addLast(t.right);
                }
            }
            cur++;
        }
        return root;
    }


}

class TreeNode {
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