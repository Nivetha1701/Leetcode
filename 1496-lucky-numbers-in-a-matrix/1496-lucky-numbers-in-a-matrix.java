
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

        // int m=matrix.length;
        // int n=matrix[0].length;
        // int rowMin[]=new int[m];
        // int colMax[]=new int[n];
        // Arrays.fill(rowMin, Integer.MAX_VALUE);
        // Arrays.fill(colMax, Integer.MIN_VALUE);
        // for(int i=0;i<m;i++){
        //     for(int j =0;j<n;j++){
        //         rowMin[i]=Math.min(rowMin[i], matrix[i][j]);
        //         colMax[j]=Math.max(colMax[j],matrix[i][j]);
        //     }
        // }
        // ArrayList<Integer> al=new ArrayList<>();
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j]==rowMin[i] && matrix[i][j]==colMax[j]){
        //             al.add(matrix[i][j]);
        //         }
        //     }
        // }
        // return al;