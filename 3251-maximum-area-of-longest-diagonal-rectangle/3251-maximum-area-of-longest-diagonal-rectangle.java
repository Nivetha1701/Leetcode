class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max=Integer.MIN_VALUE,maxArea=0;
        for(int i=0;i<dimensions.length;i++){
            int len=dimensions[i][0];
            int wid=dimensions[i][1];
            int diag=(len*len)+(wid*wid);
            int area=len*wid;
            if(diag>max || (diag==max && area>maxArea)){
                max=diag;
                maxArea=area;
            }
        }
        return maxArea;
    }
}