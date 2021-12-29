package needtokonw;

public class methodToRotateImage {
    /*
     * clockwise rotate
     * first reverse [up to down], then [swap the symmetry]
     * 1 2 3     7 8 9     7 4 1
     * 4 5 6  => 4 5 6  => 8 5 2
     * 7 8 9     1 2 3     9 6 3
     */
 /*
  void rotate(vector<vector<int> > &matrix) {
        reverse(matrix.begin(), matrix.end());
        for (int i = 0; i < matrix.size(); ++i) {
            for (int j = i + 1; j < matrix[i].size(); ++j)
                swap(matrix[i][j], matrix[j][i]);
        }
    }
    */

    /*
     * anticlockwise rotate
     * first reverse [left to right], then [swap the symmetry]
     * 1 2 3     3 2 1     3 6 9
     * 4 5 6  => 6 5 4  => 2 5 8
     * 7 8 9     9 8 7     1 4 7
     */


    /*
  void anti_rotate(vector<vector<int> > &matrix) {
     for (int i = 0; i < matrix.size(); ++i) {
         for (int j = i + 1; j < matrix[i].size(); ++j)
             swap(matrix[i][j], matrix[j][i]);
     }
     reverse(matrix.begin(), matrix.end());
 }
 */

  /*  clock wise

    public void rotate(int[][] matrix) {
        swapRows(matrix);
        transpose(matrix);
    }

    private void swapRows(int[][] matrix) {
        int lo = 0;
        int hi = matrix.length - 1;
        while (lo < hi) {
            int[] temp = matrix[lo];
            matrix[lo++] = matrix[hi];
            matrix[hi--] = temp;
        }
    }

    private void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
   */


   /* anti-clockwise

    public void rotate(int[][] matrix) {
        transpose(matrix);
        swapRows(matrix);
    }

    private void swapRows(int[][] matrix) {
        int lo = 0;
        int hi = matrix.length - 1;
        while (lo < hi) {
            int[] temp = matrix[lo];
            matrix[lo++] = matrix[hi];
            matrix[hi--] = temp;
        }
    }

    private void transpose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    */


}
