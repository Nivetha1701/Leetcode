
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int minRow=matrix[i][0];
            int colIndex=0;
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[i][j]<minRow){
                    minRow=matrix[i][j];
                    colIndex=j;
                }
            }
            boolean maxCol=true;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][colIndex]>minRow){
                    maxCol=false;
                    break;
                }
            }
            if(maxCol){
                al.add(minRow);
            }
        }
        return al;
    }
}
