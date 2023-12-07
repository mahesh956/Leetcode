class Solution {
    public String largestOddNumber(String num) {
        if(num.charAt(num.length()-1)%2==1) return num;
        int n=num.length()-1;
        while(n>=0){
            int a=num.charAt(n);
            if(a%2==1) return num.substring(0,n+1);
            n--;
        }
        return "";
        
    }
}