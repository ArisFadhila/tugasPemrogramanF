package array2D;

import java.util.Scanner;

import static array2D.OperasiMatrix.displayMatrix;

public class MatrixOperasi {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Masukkan jumlah baris matriks: ");
            int baris = scanner.nextInt();
            System.out.print("Masukkan jumlah kolom matriks: ");
            int kolom = scanner.nextInt();


            int[][] matriksA = new int[baris][kolom];
            int[][] matriksB = new int[baris][kolom];


            System.out.println("Masukkan elemen matriks A:");
            for (int i = 0; i < baris; i++) {

                for (int j = 0; j < kolom; j++) {
                    matriksA[i][j] = scanner.nextInt();

                }
            }
            System.out.println("Masukkan elemen matriks B:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    matriksB[i][j] = scanner.nextInt();
                }
            }
            // Menampilkan matriks pertama
            System.out.println("Matriks pertama:");
            displayMatrix(matriksA);
            // Menampilkan matriks ke dua
            System.out.println("Matriks kedua:");
            displayMatrix(matriksB);

            int[][] matriksC = new int[baris][kolom];
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    matriksC[i][j] = matriksA[i][j] + matriksB[i][j];
                }
            }


            int[][] matriksD = new int[baris][kolom];
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    matriksD[i][j] = matriksA[i][j] - matriksB[i][j];
                }
            }


            System.out.println("Hasil Penjumlahan Matriks A dan B:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print(matriksC[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Hasil Pengurangan Matriks A dan B:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print(matriksD[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

