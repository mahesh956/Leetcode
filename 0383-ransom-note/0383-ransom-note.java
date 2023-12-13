class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> hm = new HashMap<>();

        // Iterate through the characters in the magazine
        for (int i = 0; i < magazine.length(); i++) {
            hm.put(magazine.charAt(i),hm.getOrDefault(magazine.charAt(i),0)+1);
        }
        
        // Iterate through the characters in the ransom note
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            
            // If the character is present in the HashMap and its count is greater than 0,
            // decrement its count by 1
            if (hm.containsKey(c) && hm.get(c) > 0) {
                hm.put(c, hm.get(c) - 1);
            } else {
                // If the character is not present or its count is 0, return false
                return false;
            }
        }
        
        // All characters in the ransom note have been processed successfully,
        // so the ransom note can be formed from the magazine
        return true;
    }
}