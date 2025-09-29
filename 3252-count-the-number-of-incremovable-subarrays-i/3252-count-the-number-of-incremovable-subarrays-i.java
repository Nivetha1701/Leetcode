class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length, count = 0;

        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                if (valid(nums, l, r)) count++;
            }
        }
        return count;
    }

    private boolean valid(int[] nums, int l, int r) {
        int prev = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i >= l && i <= r) continue;
            if (nums[i] <= prev) return false;
            prev = nums[i];
        }
        return true;
    }
}
