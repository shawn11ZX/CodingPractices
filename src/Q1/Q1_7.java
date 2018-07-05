package Q1;

/**
 * should consider size of odd and even number
 *
 */
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

        // if even size, only (n/2, n/2) is needed
        // if odd size, a little bit complicated for we should not (n+1)/2, (n+1)/2 will rotate twice for some positions
        for(int i = 0; i < (n+1)/2; i++)
            for (int j = 0; j < (n)/2; j++)
            {
                    int temp = m.getItem(i, j);
                    m.setItem(i, j, m.getItem(j, n - i - 1));
                    m.setItem(j, n - i - 1, m.getItem(n - i - 1, n - j - 1));
                    m.setItem(n - i - 1, n - j - 1, m.getItem(n - j - 1, i));
                    m.setItem(n - j - 1, i, temp);

            }
    }

}
