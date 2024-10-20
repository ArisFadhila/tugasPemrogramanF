package array2D;

import java.util.Scanner;

    public class StudentData {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

                System.out.print("Masukkan jumlah data mahasiswa: ");
                int n = scanner.nextInt();

                // Membuat array 2D untuk menyimpan data mahasiswa
                String[][] dataMahasiswa = new String[n][4]; // 4 kolom untuk Nama, NIM, Jurusan, IPK

                // Memasukkan data mahasiswa
                for (int i = 0; i < n; i++) {
                    System.out.println("Data mahasiswa ke-" + (i + 1) + ":");
                    System.out.print("Nama: ");
                    dataMahasiswa[i][0] = scanner.next();
                    System.out.print("NIM: ");
                    dataMahasiswa[i][1] = scanner.next();
                    System.out.print("Jurusan: ");
                    dataMahasiswa[i][2] = scanner.next();
                    System.out.print("IPK: ");
                    dataMahasiswa[i][3] = scanner.next();
                }

                // Menampilkan data mahasiswa dalam bentuk tabel
                System.out.println("\nTabel Data Mahasiswa:");
                System.out.println("-------------------------------------------------------------");
                System.out.printf("| %-20s | %-10s | %-15s | %-5s |\n", "Nama", "NIM", "Jurusan", "IPK");
                System.out.println("-------------------------------------------------------------");
                for (int i = 0; i < n; i++) {
                    System.out.printf("| %-20s | %-10s | %-15s | %-5s |\n", dataMahasiswa[i][0], dataMahasiswa[i][1], dataMahasiswa[i][2], dataMahasiswa[i][3]);
                }
                System.out.println("-------------------------------------------------------------");

                scanner.close();
            }
        }

