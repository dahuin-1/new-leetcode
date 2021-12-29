package Top100andTopInterview.medium;

public class RotateImage {
    public static void main(String[] args) {
        RotateImage ri = new RotateImage();
        int [][] matrix ={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        ri.rotate(matrix);
    }
    public void rotate(int[][] matrix) {
        swapRows(matrix);
        transpose(matrix);
    }
    private void swapRows(int[][] matrix) {
        int low = 0;
        int high = matrix.length - 1;
        while (low < high) {
            int[] temp = matrix[low];
            matrix[low++] = matrix[high];
            matrix[high--] = temp;
        }
    }
    private void transpose(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }


     /*   int length = matrix.length; //4
        System.out.println(length);
        for(int side = length; side > 1; side -= 2){
            int low = (length-1)/2; //1
            System.out.println(low);
            int high = low + side - 1; // 1 + 4 - 1 = 4
            System.out.println(high);
            for (int i = 0; i < side - 1; i++) {
                int temp = matrix[high-i][low]; // temp = [4][1]

                matrix[low][low+i] = temp; //[1][1]
            }

        }*/
}
