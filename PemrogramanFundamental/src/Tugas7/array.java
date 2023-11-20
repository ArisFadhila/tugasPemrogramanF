package Tugas7;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Array");
        System.out.print("Jumlah data: ");
        int a;
        a = sc.nextInt();

        System.out.println("Inputkan data berikut: ");
        int[] input = new int[a];
        int total = 0;
        for (int x = 0; x < input.length; x++) {
            System.out.print("Data ke-" + x + ": ");
            input[x] = sc.nextInt();
        }

        System.out.println("Menampilkan data");

        for(int y = 0; y < input.length; y++) {
            int data = input[y] % 2;
            if (data == 0) {
                System.out.println(input[y]+" -> GENAP");
            } else {
                System.out.println(input[y]+" -> GANJIL");
            }
            total += input[y];
        }

        double rataRata =  total / input.length;
        System.out.println("TOTAL PENJUMLAHAN: " + total);
        System.out.println("RATA-RATA= " + rataRata);
    }
}
