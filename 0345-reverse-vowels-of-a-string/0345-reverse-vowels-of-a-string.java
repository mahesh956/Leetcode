class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while(i<j){
            while(i<j){
            if(contains(arr[i])) break;
            i++;
            }
            while(j>i){
            if(contains(arr[j])) break;
                j--; 
            }
            if(i >= j) return String.valueOf(arr);
            swap(arr,i,j);
            i++;j--;
        }
        return String.valueOf(arr);
    }
    public void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public boolean contains(char c){
       char[] vowels = new char[]{'a','e','i','o','u','A','E','I','O','U'};
       for(int i = 0; i<10; i++){
           if(c == vowels[i]) return true;
       }
       return false;
    }
}