class Solution { 
    public String reverseWords(String s) {
        s=s.trim();
        String str[]=s.split("\\s+");
        Collections.reverse(Arrays.asList(str));
        String ans=String.join(" ",str);
        return ans;

    //     String str[]=s.trim().split("\\s+");
    //     String st="";
    //    for(int i=str.length-1;i>=0;i--){
    //         st+=str[i];
    //         if(i!=0){
    //             st+=" ";
    //         }
    //    }
    //    return st;
    }
}