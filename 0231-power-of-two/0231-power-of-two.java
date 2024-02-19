class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1 || n==2){
            return true;
        }
        if(n%4==0){
            for(int i=1;i*i<=n+1;i++){
                if(n==Math.pow(2,i)){
                    return true;
                }
            }
        }
    return false;
    }
}  