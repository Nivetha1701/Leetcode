class Solution {
    public String[] findWords(String[] words) {
        List<String> al=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")){
                al.add(words[i]);
            }
        }
        return al.toArray(new String[0]);

        // return Arrays.stream(words)
        // .filter(w-> w.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
        // .toArray(String[]::new);
    }
}