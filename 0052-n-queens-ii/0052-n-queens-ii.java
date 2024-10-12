import java.math.*;

class Solution {
    public int totalNQueens(int n) {
        int queens[]=new int[n];
        return solve(queens,0,n);
    }
    private int solve(int queens[],int row,int n)
    {
        if(row==n)
        {
            return 1;
        }
        int solution=0;
        for(int col=0;col<n;col++)
        {
            if(issafe(queens,row,col))
            {
                queens[row]=col;
                solution+=solve(queens,row+1,n);
            }
        }
        return solution;
    }
    private boolean issafe(int queens[],int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            if(queens[i]==col || Math.abs(queens[i]-col)==Math.abs(i-row))
            {
                return false;
            }
        }
        return true;
    }
}