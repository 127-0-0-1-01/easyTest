package SeptemberTree.twentyday.bs;

import java.util.Arrays;

public class leetcode4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int idx = 0;
        int[] cur = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            cur[idx++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            cur[idx++] = nums2[i];
        }
        Arrays.sort(cur);
        //寻找中位数
        int r = cur[(cur.length - 1) / 2], l = cur[cur.length / 2];
        return (l + r) / 2.0;
    }


}
