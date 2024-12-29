class Solution {
    public boolean equalFrequency(String word) {
        int[] count = new int[26];
        int n = word.length();
        
        // Count frequencies of each character in the word
        for (int i = 0; i < n; i++) {
            count[word.charAt(i) - 'a']++;
        }
        
        // Try removing one character and check if the frequencies become equal
        for (int i = 0; i < n; i++) {
            char c = word.charAt(i);
            count[c - 'a']--;
            
            // Check if all frequencies are the same
            int freq = -1;
            boolean valid = true;
            for (int j = 0; j < 26; j++) {
                if (count[j] > 0) {
                    if (freq == -1) {
                        freq = count[j];
                    } else if (count[j] != freq) {
                        valid = false;
                        break;
                    }
                }
            }
            
            // If all frequencies are equal, return true
            if (valid) return true;
            
            // Restore the count after removal
            count[c - 'a']++;
        }
        
        return false;
    }
}
