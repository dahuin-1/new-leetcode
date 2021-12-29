package AnotherProblems;/*in MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.

You are given an m x n matrix mat and two integers r and c representing the row number and column number of the wanted reshaped matrix.

The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
*/


public class reverseInteger {

    public static void main(String[] args) {
        reverseInteger reverseInteger = new reverseInteger();
        reverseInteger.reverse(-2938);
    }

    public int reverse(int x) {
        if (x == 0) {
            return x;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String newX = Integer.toString(x);

        for (int i = newX.length() - 1; i >= 0; i--) {
            stringBuilder.append(newX.charAt(i));
        }

        if (isMinus(String.valueOf(stringBuilder))) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            stringBuilder.insert(0, "-");
        }
        while (String.valueOf(stringBuilder).startsWith("0")) {
            stringBuilder.deleteCharAt(0);
        }
        return Integer.parseInt(String.valueOf(stringBuilder));
    }

    public boolean isMinus(String x) {
        if (x.endsWith("-")) {
            return true;
        } else {
            return false;
        }
    }
}
