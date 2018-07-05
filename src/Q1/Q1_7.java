package Q1;

public class Q1_7 {
    static class Matrix {
        public Matrix(int [] data, int n) {
            _data = data;
            _n = n;
        }

        public void setItem(int row, int col, int val)
        {
            _data[row * _n + col] = val;
        }
        public int getItem(int row, int col) {
            return _data[row * _n + col];
        }
        int _data[];
        int _n;

        public int getN() {
            return _n;
        }
        public int [] getData() {
            return _data;
        }

    }

    static public void rotate(Matrix m)
    {
        int n = m.getN();
        for(int i = 0; i < n/2; i++)
            for (int j = 0; j < n/2; j++)
            {
                int temp = m.getItem(i, j);
                m.setItem(i, j, m.getItem(i, n-j-1));
                m.setItem(i, n-j-1, m.getItem(n-j-1, n-j-1));
                m.setItem(n-i-1, n-j-1, m.getItem(n-i-1, j));
                m.setItem(n-j-1, j, temp);
            }
    }

}
