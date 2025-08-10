class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int ans[]=new int[n];
        char ch[]=s.toCharArray();
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(ch[j]==c){
                    min=Math.min(min,Math.abs(i-j));
                }
            }
            ans[i]=min;
        }
        return ans;
    }
}