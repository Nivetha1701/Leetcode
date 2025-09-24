class Solution {
    public String[] findWords(String[] words) {

        List<String> al=new ArrayList<>();
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        for(int i=0;i<words.length;i++){
            String s=words[i].toLowerCase();
            String row="";
            if(row1.contains(""+s.charAt(0))) row=row1;
            else if(row2.contains(""+s.charAt(0))) row=row2;
            else row=row3;

            boolean valid=true;
            for(char c:s.toCharArray()){
                if(!row.contains(""+c)){
                    valid=false;
                    break;
                }
            }
            if(valid){
                al.add(words[i]);
            }
        }
        return al.toArray(new String[0]);
    }
}
        // List<String> al=new ArrayList<>();
        // for(int i=0;i<words.length;i++){
        //     if(words[i].toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")){
        //         al.add(words[i]);
        //     }
        // }
        // return al.toArray(new String[0]);

        // return Arrays.stream(words)
        // .filter(w-> w.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*"))
        // .toArray(String[]::new);