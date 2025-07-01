class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m=image.length;
        int n=image[0].length;
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=image[i][n-j-1];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(ans[i][j]==0){
                    ans[i][j]=1;
                } else{
                    ans[i][j]=0;
                }
            }
        }
        return ans;
    }
}