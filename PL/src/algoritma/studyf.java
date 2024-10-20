package algoritma;

import java.util.Scanner;

public class studyf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input index-->");
        int baris = sc.nextInt();

        for (int i = 2; i <= baris; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print("4 ");
            }
           System.out.println();
        }
    }
}