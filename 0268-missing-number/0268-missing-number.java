class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n*(n+1))/2;
        int summ=0;
        for(int i=0;i<nums.length;i++){
            summ+=nums[i];
        }
        return sum-summ;
    }
}