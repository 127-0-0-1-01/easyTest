package SeptemberTree.eighteenday;

public class S_binarySearch {


    public static int binarySearch(int[] nums, int t) {
        int l = 0, n = nums.length, r = n - 1;
        //简单说来就是
        /*
          i ,j  此时位于 数组的两端 这个 x 位于 数组 nums的中间对不对 如果这个 nums[x]>t 说名 x 的右边所有的数据都大于 t
          也就是  nums[x]...nums[j] > t
          而  t 一定存在于     nums[i]...nums[x] 之间 或者不存在
          接下 减小范围重新循环即可也就是更新  i = i j= x-1;
          反之也是相同的道理
         */
        while (l < r) {

            int mid = l + r >> 1;
            if (nums[mid] >= t) {
                r = mid;
            } else {
                l= mid +1;
            }
        }
        //理论上等 i 和 j 相遇就是答案
        return l;
    }
    public static int binarySearch2(int[] nums, int t) {
        int l = 0, n = nums.length, r = n - 1;
        //简单说来就是
        /*
          i ,j  此时位于 数组的两端 这个 x 位于 数组 nums的中间对不对 如果这个 nums[x]>t 说名 x 的右边所有的数据都大于 t
          也就是  nums[x]...nums[j] > t
          而  t 一定存在于     nums[i]...nums[x] 之间 或者不存在
          接下 减小范围重新循环即可也就是更新  i = i j= x-1;
          反之也是相同的道理
         */
        while (l < r) {
            int mid = l + r +1 >> 1;
            if (nums[mid] <= t) {
                l=mid;
            } else {
                r= mid -1;
            }
        }
        //理论上等 i 和 j 相遇就是答案
        return l;
    }

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5}, 2));
        System.out.println(binarySearch2(new int[]{1, 2, 3, 4, 5}, 2));

    }

/*    这两个二分查找模板一个是更新右端点一个是更新左端点 两者区别不大
    主要是一个的中间值 mid 取得是 l+r>>1  还有一个取得是 l+r+1>>1

    解释下为啥当取 左端点不能用 l+r>>1 而要用 l+r+>>1

    举个例子嘿嘿  当刚好进行到 l = 0 r = 1 l+r>>1 等于 1/2 =0 向下取整 所以更新的结果是 l=0,r=1 这时候死循环
    但是 l+r+1>>1 等于 2/2 = 1 这时候更新结果就是 l=1 r=1 刚好结束循环*/
}
