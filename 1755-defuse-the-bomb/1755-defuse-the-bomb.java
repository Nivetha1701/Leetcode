class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int ans[]=new int[n];
        for(int i=0;i<code.length;i++){
            int sum=0;
            if(k>0){
                for(int j=1;j<=k;j++){
                    sum+=code[(i+j)%n];
                }
            } else if(k<0){
                for(int j=1;j<= -k;j++){
                    sum+=code[(i-j+n)%n];
                }
            }
            ans[i]=sum;
        }
        return ans;
    }
}