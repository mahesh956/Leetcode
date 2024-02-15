class Solution {
    public long largestPerimeter(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        long sum=0;
        for(int num:nums){
            sum+=num;
        }
        for(int i=n-1;i>=2;i--){
            sum=sum-nums[i];
            if(sum>nums[i]){
                return sum+nums[i];
            }
        }
        return -1;
    }
}