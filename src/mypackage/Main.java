package mypackage;

public class Main {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(3);
        matrix.fillUpMatrix(0, 9);
        matrix.calculateDiagonalDifference(matrix);
    }
}
