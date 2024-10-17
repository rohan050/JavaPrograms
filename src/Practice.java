import java.util.*;
class SpiralPrintMatrix {
    public static void spiralPrint(int m, int n, int[][] a)
    {
        int top = 0, bottom = m - 1, left = 0,
                right = n - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; ++i) {
                System.out.print(a[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; ++i) {
                System.out.print(a[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args)
    {
        int[][] matrix = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        spiralPrint(matrix.length, matrix[0].length,
                matrix);
    }
}