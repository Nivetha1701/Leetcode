class Solution {
    public boolean judgeCircle(String moves) {
        int n=moves.length();
        char c[]=moves.toCharArray();
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(c[i]=='R'){
                count1++;
            } else if(c[i]=='L'){
                count1--;
            } else if(c[i]=='U'){
                count2++;
            } else if(c[i]=='D'){
                count2--;
            }
        }
        if(count1==0 && count2==0){
            return true;
        } 
        return false;
    }
}