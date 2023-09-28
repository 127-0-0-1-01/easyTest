package SeptemberTree.twoday;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode1104 {


    public static List<Integer> pathInZigZagTree(int label) {
        List<Integer> ans = new ArrayList<>();
        //存储正序的数据
        Stack<Integer> stack = new Stack<>();
        while (label != 0) {
            stack.add(label);
            label = label >> 1;
        }
        while (!stack.isEmpty()) {
            ans.add(stack.pop());
        }
        boolean flag = true;
        // 1 .... label
        if (ans.size() % 2 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        for (int i = ans.size() - 1; i >= 0; i--) {
            if (flag) {
                if (i == ans.size() - 1) {
                    ans.set(i, ans.get(i));
                } else if ((i % 2 == 0)) {
                    ans.set(i, 3 * (int) Math.pow(2, i) - 1 - (ans.get(i)));
                } else {
                    ans.set(i, ans.get(i));

                }
            }else {
                if (i == ans.size() - 1) {
                    ans.set(i, ans.get(i));
                } else if ((i % 2 == 0)) {
                    ans.set(i, ans.get(i));
                } else {
                    ans.set(i, 3 * (int) Math.pow(2, i) - 1 - (ans.get(i)));
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(pathInZigZagTree(14));
        System.out.println(pathInZigZagTree(26));

    }

}
