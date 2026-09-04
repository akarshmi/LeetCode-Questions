class Solution {
    public int findMin(int[] nums) {

        int l = 0, r = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while (l <= r) {
            min = Math.min(min, nums[l]);
            min = Math.min(min, nums[r]);
            r--;
            l++;
        }

        return min;

    }
}