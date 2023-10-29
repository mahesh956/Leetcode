class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if(buckets--==1){
            return 0;
        }
        int base=minutesToTest/minutesToDie+1;
        int result=0;
        while(buckets>0){
            buckets/=base;
            result+=1;
        }
        return result;
    }
}