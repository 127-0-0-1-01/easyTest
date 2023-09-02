package SeptemberTree.firstday;

public class Easy2511 {

    /**
     * [https://leetcode.cn/problems/maximum-enemy-forts-that-can-be-captured/description/]
     *
     * @param forts
     * @return
     */
    public int captureForts(int[] forts) {
        //转换成求取两个数字{-1，1}的之间 0的个数的最大值

        int ans = 0;
        int pre = -1;
        for (int i = 0; i < forts.length; i++) {
            //不等于0说明 -1或者 1出现了
            if (forts[i] != 0) {
                //含义是 不等于 0的两个数字互不相等 同时 pre 已经冲 -1 被更新了 说明第一个数字不等于0的数字已经被找到
                if (pre != -1 && forts[pre] != forts[i] ){
                    ans = Math.max(ans, i - pre - 1);
                }
                pre = i;
            }
        }
        return ans;
    }
}
