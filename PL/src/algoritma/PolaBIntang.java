package algoritma;

import java.util.Scanner;

public class PolaBIntang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan baris (1-20): ");
        int baris = input.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
