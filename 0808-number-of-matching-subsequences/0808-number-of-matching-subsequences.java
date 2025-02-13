class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        for (String word : words) {
            if (isSubsequence(word, s)) {
                count++;
            }
        }
        return count;
    }

    private boolean isSubsequence(String word, String s) {
        int index = -1;
        for (char c : word.toCharArray()) {
            index = s.indexOf(c, index + 1);  
            if (index == -1) return false;  
        }
        return true;
    }
}
