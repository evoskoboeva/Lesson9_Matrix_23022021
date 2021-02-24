package com.companyCat;

public class Matrix {
    public double[][] matrix;
    private static int size = 3;

    int rows;
    int columns;
    static Matrix matrixd = new Matrix(Matrix.getSize(),Matrix.getSize()) ;



    public Matrix(int size)
    {
        this.columns = size;
        this.rows = size;
        this.matrix = new double[size][size];
        for (int i = 0; i < size; i++) {
            this.matrix[i] = new double[size];
        }
    }

    public Matrix(int rows, int columns)
    {
        this.columns = columns;
        this.rows = rows;
        this.matrix = new double[rows][columns];
    }

    public static Matrix CalcD(Matrix matrix1, Matrix matrix2) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixd.matrix[i][j] = 3*matrix1.matrix[i][j] * matrix2.matrix[i][j]+
                        (matrix1.matrix[i][j] - matrix2.matrix[i][j])*matrix1.matrix[i][j];

            }

        }

        return Matrix.MatrixOutput1(matrixd);
    }



    public static boolean CalcInverse(Matrix matrix1, Matrix matrix2) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (matrix1.matrix[i][j]*matrix2.matrix[i][j]-1 == 0.0000000000000001){
                count++;
                }
            }
        }
        if (count == size*size) return true;
           else
        return false;
    }

    public boolean isIdentity()
    {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == j) {
                    if (Math.abs(this.matrix[i][j]) - 1 != 0.00000000000000000001 ) { return false; }
                }
                else {
                    if (Math.abs(this.matrix[i][j]) - 0 != 0.0000000000000000001) { return false; }
                }
            }
        }
        return true;
    }
    public static Matrix MatrixOutput1(Matrix matrix1) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((matrix1.matrix[i][j])+"  ");
            }
            System.out.println(System.lineSeparator());
        }

        return matrix1;
    }

    public static void MatrixInput1(Matrix matrix1) {
        matrix1.matrix[0][0] = 1;
        matrix1.matrix[0][1] = 2;
        matrix1.matrix[0][2] = 2;
        matrix1.matrix[1][0] = 0;
        matrix1.matrix[1][1] = 3;
        matrix1.matrix[1][2] = 1;
        matrix1.matrix[2][0] = 1;
        matrix1.matrix[2][1] = 0;
        matrix1.matrix[2][2] = 0;

    }

    public static void MatrixOutput2(Matrix matrix2) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print((matrix2.matrix[i][j])+"  ");
            }
            System.out.println(System.lineSeparator());
        }

    }

    public static void MatrixInput2(Matrix matrix2) {

        matrix2.matrix[0][0] = 0.;
        matrix2.matrix[0][1] = 0.;
        matrix2.matrix[0][2] = 1.;
        matrix2.matrix[1][0] = -1./4;
        matrix2.matrix[1][1] = 1./2;
        matrix2.matrix[1][2] = 1./4;
        matrix2.matrix[2][0] = 3./4;
        matrix2.matrix[2][1] = -1./2;
        matrix2.matrix[2][2] = -7./10;


    }
    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        Matrix.size = size;
    }


}


