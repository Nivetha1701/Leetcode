class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;

        // If both strings are already equal
        if (s.equals(goal)) {
            // Check if any character is repeated (so we can swap identical chars)
            int[] freq = new int[26];
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
                if (freq[c - 'a'] > 1) return true;
            }
            return false;
        }

        // Find indices where characters differ
        List<Integer> diff = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diff.add(i);
            }
        }

        // There must be exactly 2 different positions to swap
        if (diff.size() != 2) return false;

        // Check if swapping makes them equal
        int i = diff.get(0), j = diff.get(1);
        return s.charAt(i) == goal.charAt(j) && s.charAt(j) == goal.charAt(i);
    }
}
