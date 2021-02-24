package com.companyCat;

public class Main {



    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(Matrix.getSize());
        Matrix matrix2 = new Matrix(Matrix.getSize(), Matrix.getSize());


        Matrix.MatrixInput1(matrix1);
        Matrix.MatrixInput2(matrix2);
        System.out.println(" matrix1");
        Matrix.MatrixOutput1(matrix1);
        System.out.println(" matrix 2");

        Matrix.MatrixOutput1(matrix2);
        System.out.println(" matrix D");
        Matrix.CalcD(matrix1, matrix2);
        System.out.println("матрицы обратные?"+  Matrix.CalcInverse(matrix1,matrix2));

        System.out.println(matrix1.isIdentity());
        System.out.println(matrix2.isIdentity());

    }


}
