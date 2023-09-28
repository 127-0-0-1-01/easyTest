package SeptemberTree.twoday;

import java.util.Arrays;

public class Leetcode1921 {

    public static int eliminateMaximum(int[] dist, int[] speed) {
        int n = dist.length;
        int[] arrivalTimes = new int[n];
        for (int i = 0; i < n; i++) {
            arrivalTimes[i] = (dist[i] - 1) / speed[i] + 1;
        }
        Arrays.sort(arrivalTimes);
        for (int i = 0; i < n; i++) {
            if (arrivalTimes[i] <= i) {
                return i;
            }
        }
        return n;
    }


    public static void main(String[] args) {

        System.out.println(eliminateMaximum(new int[]{1, 3, 4}, new int[]{1, 1, 1}));
    }


}
