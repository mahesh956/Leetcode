class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum=0;
        int[] count=new int[26];
        for(char ch:chars.toCharArray()){
            count[ch-'a']++;
        }
        for(String word:words){
            int[] temp=count.clone();
            boolean match=true;
            
            for(char ch:word.toCharArray()){
                if(--temp[ch-'a']<0){
                    match=false;
                    break;
                }
            }
            if(match){
                sum+=word.length();
            }
        }
        return sum;
    }
}