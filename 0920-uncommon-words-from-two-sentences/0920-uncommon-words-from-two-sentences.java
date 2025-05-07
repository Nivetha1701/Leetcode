import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashSet<String> once=new HashSet<>();
        HashSet<String> multiple=new HashSet<>();
        for(String word : (s1+" "+s2).split(" ")){
            if(!once.add(word)){
                multiple.add(word);
            }
        }
        once.removeAll(multiple);
        return once.toArray(new String[0]);


        // ArrayList<String> al=new ArrayList<>();
        // ArrayList<String> ans=new ArrayList<>();
        // String[] str1 = s1.split(" ");
        // String[] str2 = s2.split(" ");
        // for(String num:str1){
        //     al.add(num);
        // }
        // for(String num:str2){
        //     al.add(num);
        // }
        // for(String word:al){
        //     int count=0;
        //     for(String w:al){
        //         if(word.equals(w)){
        //             count++;
        //         }
        //     }
        //     if(count==1){
        //         ans.add(word);
        //     }
        // }
        // String res[]=ans.toArray(new String[0]);
        // return res;
    }
}
