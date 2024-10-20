package rekursif;

import java.util.Scanner;

public class bilanganGanjil {
    public static void main(String[] args) {
        int n = 5; // Ganti n dengan jumlah bilangan ganjil yang ingin dihasilkan
        int total = printOddSeries(n, 1); // Mulai dengan bilangan ganjil terkecil, yaitu 1
        System.out.println("\nTotal: " + total);
    }

    public static int printOddSeries(int n, int start) {
        if (n == 0) {
            return 0;
        } else {
            int currentNumber = start;
            System.out.print(currentNumber + " ");
            return currentNumber + printOddSeries(n - 1, start + 2); // Lanjutkan dengan bilangan ganjil berikutnya
        }
    }


}




