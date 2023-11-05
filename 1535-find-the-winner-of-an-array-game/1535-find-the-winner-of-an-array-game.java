class Solution {
    public int getWinner(int[] arr, int k) {
        int cur=arr[0];
        int winner=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>cur){
                cur=arr[i];
                winner=0;
            }
            if(++winner==k){
                break;
            }
        }
        return cur;
    }
}