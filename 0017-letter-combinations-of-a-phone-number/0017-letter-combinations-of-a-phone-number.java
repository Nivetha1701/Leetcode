class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("");
        for (char digit : digits.toCharArray()) {
            int d = digit - '0'; 
            String letters = mapping[d]; 
            int size = queue.size(); 
            while (size-- > 0) {
                String prefix = queue.poll(); 
                for (char letter : letters.toCharArray()) {
                    queue.add(prefix + letter); 
                }
            }
        }
        return new ArrayList<>(queue);
    }
}
