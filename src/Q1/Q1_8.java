package Q1;

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
