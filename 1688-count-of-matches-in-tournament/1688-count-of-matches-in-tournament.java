class Solution {
    public int numberOfMatches(int n) {
        int count=0;
        int rem=0;
        while(n>1){
            rem=n/2;
            count+=rem;
            n=n-rem;
        }
        return count;
    }
}