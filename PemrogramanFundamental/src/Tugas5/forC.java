package Tugas5;

import java.util.Scanner;

public class forC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berapa banyak kata ingin di Ulang/Loop : ");
        int banyak =  sc.nextInt();

        System.out.print("Masukkan Kata yang ingin di Ulang/Loop : ");
        String kata = sc.next();

        for (int i = 0; i <= banyak; i++) {
            System.out.println(kata);
        }
    }
}
