package Tugas3;

import java.util.Scanner;

public class kelilingBalok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi,res;
        System.out.println("Program Menghitung Keliling Balok");

        System.out.print("Masukan Panjang Balok: ");
        panjang = input.nextInt();
        System.out.print("Masukan Lebar balok: ");
        lebar = input.nextInt();
        System.out.print("Masukan Tinggi Balok: ");
        tinggi = input.nextInt();

        res = 4 * (panjang + lebar + tinggi);

        System.out.println("Keliling Balok tersebut adalah: " + res);


    }
}
