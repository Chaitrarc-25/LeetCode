class Solution {
    public int mostFrequentEven(int[] nums) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
      
        for (int number : nums) {
            if (number % 2 == 0) {
                
                frequencyMap.merge(number, 1, Integer::sum);
            }
        }
      
        int result = -1;
        int maxFrequency = 0;
      
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentNumber = entry.getKey();
            int currentFrequency = entry.getValue();
            
            if (maxFrequency < currentFrequency || 
                (maxFrequency == currentFrequency && result > currentNumber)) {
                result = currentNumber;
                maxFrequency = currentFrequency;
            }
        }
      
        return result;
    }
}
