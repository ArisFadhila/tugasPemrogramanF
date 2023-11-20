package Tugas5;

import java.util.Scanner;

public class doWhileC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan berapa banyak kata ingin diulangi : ");
        int jumlah =  sc.nextInt();

        System.out.print("Masukkan Kata yang ingin diulangi: ");
        String kata = sc.next();
        int i = 0;
        do{
            System.out.println(kata);
            i++;
        }while (i <= jumlah);

    }
}
