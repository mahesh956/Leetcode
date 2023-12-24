class Solution {
    public int minOperations(String s) {
        int zerocnt=0;
        int onecnt=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(s.charAt(i)=='1'){
                    onecnt++;
                }else{
                    zerocnt++;
                }
            }else{
                if(s.charAt(i)=='1'){
                    zerocnt++;
                }else{
                    onecnt++;
                }
            }
        }
        return Math.min(zerocnt,onecnt);
    }
}