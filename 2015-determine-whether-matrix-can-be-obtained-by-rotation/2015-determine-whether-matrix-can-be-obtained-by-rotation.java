class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(areEqual(mat,target)){
                return true;
            } else{
                mat=rotate90(mat);
            }
        }
        return false;
    }
    public int[][] rotate90(int[][] mat) {
        int n=mat.length;
        int trans[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                trans[i][j]=mat[j][i];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=trans[i][j];
                trans[i][j]=trans[i][n-1-j];
                trans[i][n-1-j]=temp;
            }
        }
        return trans;
    }
    public boolean areEqual(int mat[][],int target[][]){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}