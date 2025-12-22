class Solution {
    public int numSpecial(int[][] mat) {
        int rowCount[]=new int[mat.length];
        int ColCount[]=new int[mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    rowCount[i]++;
                    ColCount[j]++;
                }
            }
        }
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1 && rowCount[i]==1 && ColCount[j]==1){
                    count++;
                }
            }
        }
        return count;
    }
}