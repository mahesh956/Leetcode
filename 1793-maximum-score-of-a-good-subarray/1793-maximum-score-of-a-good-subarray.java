class Solution {
    public int maximumScore(int[] nums, int k) {
        int l = k, r = k;
        int min_val = nums[k];
        int max = min_val;

        while (l > 0 || r < nums.length - 1) {
            if (l == 0 || (r < nums.length - 1 && nums[r + 1] > nums[l - 1])) {
                r++;
            } else {
                l--;
            }
            min_val = Math.min(min_val, Math.min(nums[l], nums[r]));
            max = Math.max(max, min_val * (r - l + 1));
        }
        
        return max;
    }
}