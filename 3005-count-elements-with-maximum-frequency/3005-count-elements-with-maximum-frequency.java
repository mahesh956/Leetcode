class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Check for invalid input
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Use a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Find the maximum frequency
        int maxFrequency = 1;
        for (int num : nums) {
            // Update frequency in the map
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            
            // Update maxFrequency if needed
            maxFrequency = Math.max(maxFrequency, frequencyMap.get(num));
        }

        // If all elements have a frequency of 1, return the length of the array
        if (maxFrequency == 1) {
            return nums.length;
        }

        // Count elements with maximum frequency
        int count = 0;
        for (int key : frequencyMap.keySet()) {
            // If the frequency of the current element is the maxFrequency, increment count
            if (frequencyMap.get(key) == maxFrequency) {
                count += maxFrequency;
            }
        }

        return count;
    }
}