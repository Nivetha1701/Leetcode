class Solution {
    public String largestGoodInteger(String num) {
        char ch[]=num.toCharArray();
        char max=0;
        for(int i=0;i<ch.length-2;i++){
            if(ch[i]==ch[i+1] && ch[i+1]==ch[i+2]){
                if(ch[i]>max){
                    max=ch[i];
                }
            }
        }
        String res= ""+max+max+max;
        return max==0 ? "" : res;

        // String max="";
        // for(int i=0;i<=num.length()-3;i++){
        //     String sub=num.substring(i,i+3);
        //     if(sub.charAt(0)==sub.charAt(1) && sub.charAt(1)==sub.charAt(2)){
        //         if(sub.compareTo(max)>0){
        //             max=sub;
        //         }
        //     }
        // }
        // return max;
    }
}