class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans=0;
        for(int i=1;i<points.length;i++){
            int[] curr=points[i];
            int[] prev=points[i-1];
            int val=Math.max(Math.abs(curr[0]-prev[0]),Math.abs(curr[1]-prev[1]));
            ans+=val;
        }
        return ans;
    }
}