package Tadris;

import java.util.Scanner;

public class belajarArray {
    public static void main(String[] args) {
        Scanner pf = new Scanner(System.in);
        int a;
        System.out.println("Masukkan Panjang Array");
        a= pf.nextInt();
        int[]angka=new int[a];
        System.out.println("Program array dengan looping");
        int total=0;

        for (int i=0; i< angka.length; i++){
            System.out.println("index ke-"+i);
            angka[i]= pf.nextInt();
            total -= angka[i];
        }
        System.out.println("TOTAL PENJUMLAHAN: " + total);
    }
}
