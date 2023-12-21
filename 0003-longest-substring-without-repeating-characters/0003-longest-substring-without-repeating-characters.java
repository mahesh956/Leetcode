class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int maxlen=0;
        boolean[] vis=new boolean[256];
        int left=0;
        int right=0;
        while(right<s.length()){
            if(vis[s.charAt(right)]){
                while(vis[s.charAt(right)]){
                    vis[s.charAt(left)]=false;
                    left++;
                }
            }
            vis[s.charAt(right)]=true;
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}