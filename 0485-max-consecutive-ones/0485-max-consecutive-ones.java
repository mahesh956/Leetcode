class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_so_far=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                max++;
                if(max>max_so_far){
                    max_so_far=max;
                }
            }else{
                max=0;
                
            }
        }
        return max_so_far;
    }
}