package Q1;

/**
 * I originally came out with an naive algorithm with no extra space:
 * - iterate through entire matrix, and change '0' to some non-existing value 'v'
 * - 'v' can be calculated by finding the max value of elements of the matrix, 'v = m + 1'
 * - iterate through entire matrix again, for each element with value 'v', set its row and col to zero.
 *
 * There is a more elegant algorithm:
 * - store 0 mask at first row and col of the matrix: for each e[i,j] == 0, set row[0, j] = 0 and col[i, 0] = 0
 * - since the first row and col will only be changed to zero when it should have been, there is no need to back it up before head.
 * - of cause, we have to check row 0 and col 0 should be all set to zero at first.
 */
public class Q1_8 {
    static class Matrix {
        int _rows;
        int _cols;
        int [] _data;
        public Matrix (int [] data, int rows, int cols) {
            _data = data;
            _rows = rows;
            _cols = cols;
        }

        public int get(int row, int col) {
            return _data[row * _cols + col];
        }
        public void set(int row, int col, int v) {
            _data[row * _cols + col] = v;
        }
        public int getRows() {
            return _rows;
        }
        public int getCols() {
            return _cols;
        }

        public int[] getData() {
            return _data;
        }
    }
    static public void zeroMatrix(Matrix m) {
        boolean[] cols = new boolean[m.getCols()];
        boolean[] rows = new boolean[m.getRows()];
        for(int i = 0; i < m.getRows(); i++) {
            for(int j = 0; j  < m.getCols(); j++) {
                if (m.get(i, j) == 0)
                {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for(int i = 0 ; i < rows.length; i++) {
            if(rows[i]) {
                for (int j = 0; j < m.getCols(); j++) {
                    m.set(i, j, 0);
                }
            }
        }

        for (int j = 0 ; j < cols.length; j++) {
            if(cols[j])
            {
                for(int i = 0 ; i < m.getRows(); i++) {
                    m.set(i, j, 0);
                }
            }
        }
    }
}
