class Solution {
    public int[] findArray(int[] pref) {
        int pre=pref[0];
        for(int i=1;i<pref.length;i++){
            pref[i]=pref[i]^pre;
            pre=pre^pref[i];
        }
        return pref;
    }
}