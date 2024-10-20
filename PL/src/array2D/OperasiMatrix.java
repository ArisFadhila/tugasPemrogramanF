package array2D;

import java.util.Scanner;

public class OperasiMatrix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Memasukkan ukuran matriks
            System.out.print("Masukkan jumlah baris matriks: ");
            int rows = scanner.nextInt();
            System.out.print("Masukkan jumlah kolom matriks: ");
            int columns = scanner.nextInt();

            // Membuat matriks pertama
            int[][] matrix1 = new int[rows][columns];
            System.out.println("Masukkan elemen-elemen matriks pertama:");
            inputMatrixElements(matrix1, scanner);

            // Membuat matriks kedua
            int[][] matrix2 = new int[rows][columns];
            System.out.println("Masukkan elemen-elemen matriks kedua:");
            inputMatrixElements(matrix2, scanner);

            // Menampilkan matriks pertama
            System.out.println("Matriks pertama:");
            displayMatrix(matrix1);

            // Menampilkan matriks kedua
            System.out.println("Matriks kedua:");
            displayMatrix(matrix2);

           /* // Melakukan penjumlahan matriks
            int[][] sumMatrix = addMatrices(matrix1, matrix2);
            System.out.println("Hasil penjumlahan matriks:");
            displayMatrix(sumMatrix);*/

            // Melakukan pengurangan matriks
            int[][] differenceMatrix = subtractMatrices(matrix1, matrix2);
            System.out.println("Hasil pengurangan matriks:");
            displayMatrix(differenceMatrix);

            scanner.close();
        }

        // Fungsi untuk memasukkan elemen-elemen matriks
        public static void inputMatrixElements(int[][] matrix, Scanner scanner) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print("Masukkan elemen baris ke-" + (i + 1) + " kolom ke-" + (j + 1) + ": ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
        }

        // Fungsi untuk menampilkan matriks
        public static void displayMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }

        // Fungsi untuk menjumlahkan dua matriks
        public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
            int rows = matrix1.length;
            int columns = matrix1[0].length;
            int[][] result = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return result;
        }

        // Fungsi untuk mengurangkan dua matriks
        public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
            int rows = matrix1.length;
            int columns = matrix1[0].length;
            int[][] result = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return result;
        }
    }


