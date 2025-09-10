import java.util.regex.*;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        ArrayList<String> al=new ArrayList<>();
        String sep=Pattern.quote(""+separator);
        for(int i=0;i<words.size();i++){
            String[] s=words.get(i).split(sep);
            for(int j=0;j<s.length;j++){
                if(!s[j].isEmpty()){
                    al.add(s[j]);
                }
            }
        }
        return al;
    }
}