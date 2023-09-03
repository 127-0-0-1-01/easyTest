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
        //先进先出的队列里面存入--树节点
        Deque<TreeNode> d = new ArrayDeque<>();
        //将树节点接入队列末尾
        d.addLast(root);
        //记录当前层数
        int cur = 1;
        //当队列不是空的时候循环处理数据
        while (!d.isEmpty()) {
            //这一层树里面有多少个基点
            int sz = d.size();
            //循环处理所有树的节点
            while (sz-- > 0) {
                //取出第一个节点--当前节点
                TreeNode t = d.pollFirst();
                //遇见要处理的层数的时候处理
                if (cur == depth - 1) {
                    TreeNode a = new TreeNode(val), b = new TreeNode(val);
                    a.left = t.left;
                    b.right = t.right;
                    t.left = a;
                    t.right = b;
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