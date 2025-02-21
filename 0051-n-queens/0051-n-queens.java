import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), new boolean[n], new boolean[2 * n], 
        new boolean[2 * n], n);
        return res;
    }

    private void backtrack(List<List<String>> res, List<Integer> queens, boolean[] cols, boolean[] d1, boolean[] d2, int n) {
        int row = queens.size();
        if (row == n) {
            res.add(construct(queens, n));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (cols[col] || d1[row - col + n] || d2[row + col]) continue;
            queens.add(col);
            cols[col] = d1[row - col + n] = d2[row + col] = true;
            backtrack(res, queens, cols, d1, d2, n);
            queens.remove(queens.size() - 1);
            cols[col] = d1[row - col + n] = d2[row + col] = false;
        }
    }

    private List<String> construct(List<Integer> queens, int n) {
        List<String> board = new ArrayList<>();
        for (int col : queens) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            row[col] = 'Q';
            board.add(new String(row));
        }
        return board;
    }
}
