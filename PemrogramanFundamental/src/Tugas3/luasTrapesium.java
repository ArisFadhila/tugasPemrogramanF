package Tugas3;

import java.util.Scanner;

public class luasTrapesium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, t, luas;
        System.out.println("Menghitung Luas Trapesium");

        System.out.print("Masukan Sisi Pendek= ");
        a = input.nextDouble();
        System.out.print("Masukan Sisi Panjang= ");
        b = input.nextDouble();
        System.out.print("Masukan Tinggi= ");
        t = input.nextDouble();
        luas= (a+b)/2*t;
        System.out.println("Luas Trapesium Adalah= " + luas);
    }


}
