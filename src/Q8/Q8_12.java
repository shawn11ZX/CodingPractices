package Q8;

import java.util.ArrayList;

public class Q8_12 {
    public static int permQueen(int row, int[] queenLoc) {
        if (row == queenLoc.length)
            return 1;
        int count = 0;
        for (int i = 0; i < queenLoc.length; i++) {
            if (valid(row, i, queenLoc)) {
                queenLoc[row] = i;
                count += permQueen(row + 1, queenLoc);
            }
        }
        return count;
    }

    private static boolean valid(int row, int col, int[] queenLoc) {
        for (int r = 0; r < row; r++) {
            if (queenLoc[r] == col || queenLoc[r] == col - (row - r) || queenLoc[r] == col + (row - r))
                return false;
        }
        return true;
    }

    public static int GRID_SIZE = 8;

    public static void placeQueens(int row, Integer[] columns, ArrayList<Integer[]> results) {
        if (row == GRID_SIZE) // Found valid placement
        {
            results.add(columns.clone());
        } else {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (checkValid(columns, row, col)) {
                    columns[row] = col; // Place queen
                    placeQueens(row + 1, columns, results);
                }
            }
        }
    }

    /* Check if (rows, column1) is a valid spot for a queen by checking if there is a * queen in the same column or diagonal. We don't need to check it for queens in * the same row because the calling placeQueen only attempts to place one queen at * a time. We know this row is empty. */
    public static boolean checkValid(Integer[] columns, int rowl, int column1) {
        for (int row2 = 0; row2 < rowl; row2++) {
            int column2 = columns[row2]; /* Check if (row2, column2) invalidates (rowl, column1) as a * queen spot. */

            /* Check if rows have a queen in the same column */
            if (column1 == column2) {
                return false;
            }
            /* Check diagonals: if the distance between the columns equals the distance * between the rows, then they're in the same diagonal. */
            int columnDistance = Math.abs(column2 - column1);
            /* rowl > row2, so no need for abs */
            int rowDistance = rowl - row2;
            if (columnDistance == rowDistance) {
                return false;
            }
        }
        return true;

    }
}