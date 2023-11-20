package Tugas5;

import java.util.Scanner;

public class whileC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berapa banyak kata ingin diulangi : ");
        int jumlah =  sc.nextInt();

        System.out.print("Masukkan Kata yang ingin diulangi: ");
        String kata = sc.next();
        int i = 0;
        while (i <= jumlah) {
            System.out.println(kata);
            i++;
        }
    }
}
