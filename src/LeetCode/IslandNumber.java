package LeetCode;

public class IslandNumber {

    public static void main(String args[]) {
        char[][] grid = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};

        IslandNumber demo = new IslandNumber();
        System.out.println(demo.numIslands(grid));
    }

    private int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int row = grid.length;
        int col = grid[0].length;
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    this.DFSSearch(grid, row, col, i, j);
                    sum++;
                }
            }
        }
        return sum;
    }

    private void DFSSearch(char[][] grid, int row, int col, int i, int j) {
        if(i < 0 || i >= row || j < 0 || j >= col || grid[i][j] == '0') return;
        grid[i][j] = '0';
        this.DFSSearch(grid, row, col, i + 1,j);
        this.DFSSearch(grid, row, col, i - 1,j);
        this.DFSSearch(grid, row, col, i ,j + 1);
        this.DFSSearch(grid, row, col, i ,j - 1);
    }
}
