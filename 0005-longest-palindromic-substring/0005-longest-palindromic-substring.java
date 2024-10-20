class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n == 0) return "";

        String longest = "";

        // Loop through all possible substrings
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String currentSubstr = s.substring(i, j + 1);

                // Check if the current substring is a palindrome
                if (isPalindrome(currentSubstr)) {
                    // If it's the longest palindrome found, update 'longest'
                    if (currentSubstr.length() > longest.length()) {
                        longest = currentSubstr;
                    }
                }
            }
        }
        return longest;
    }

    // Helper function to check if a string is a palindrome
    private boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
