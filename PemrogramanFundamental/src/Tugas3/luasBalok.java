package Tugas3;

import java.util.Scanner;

public class luasBalok {
    public static void main (String[]afd){
    Scanner input = new Scanner(System.in);
    int panjang, lebar, tinggi, hasil;
        System.out.println("Program Menghitung Luas Balok");
		System.out.println("____________________________");
        System.out.print("Masukan Panjang Balok: ");
    panjang = input.nextInt();
        System.out.print("Masukan Lebar balok: ");
    lebar = input.nextInt();
        System.out.print("Masukan Tinggi Balok: ");
    tinggi = input.nextInt();


    hasil =  2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));

        System.out.println("Luas Balok tersebut adalah: " + hasil);


}
}
