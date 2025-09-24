class Solution {
    public String[] findWords(String[] words) {
        return Arrays.stream(words)
        .filter(w-> w.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
        .toArray(String[]::new);
    }
}