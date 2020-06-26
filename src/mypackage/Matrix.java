package mypackage;

import java.util.Vector;

public class Matrix {
    private final int size;
    Vector<Vector<Integer>> matrix;

    public Matrix(int size) {
        this.size = size;
        this.matrix = new Vector<>(size);
    }

    public Vector<Vector<Integer>> getMatrix() {
        return matrix;
    }

    public void fillUpMatrix(int min, int max) {
        for (int i = 0; i < this.size; i++) {
            Vector<Integer> matrixTemp = new Vector<>();
            for (int j = 0; j < this.size; j++) {
                matrixTemp.add(min + (int) (Math.random() * ((max - min) + 1)));
                System.out.print(matrixTemp.get(j));
            }
            System.out.println();
            matrix.add(i, matrixTemp);
        }
    }

    public void calculateDiagonalDifference(Matrix matrix) {
        int sumRightToLeft = 0;
        int sumLeftToRight = 0;

        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (i == j) {
                    sumRightToLeft += matrix.getMatrix().get(i).get(j);
                }
                if (i + j == this.size - 1) {
                    sumLeftToRight += matrix.getMatrix().get(i).get(j);
                }
            }
        }
        System.out.println("The diagonal difference is " + Math.abs(sumRightToLeft - sumLeftToRight));
    }
}
