package Uas;

import java.util.Scanner;

public class Bakteri {
    public static void main(String[] abc) {
        Scanner sc = new Scanner(System.in);
        int jumlahBacteri = 5;
        System.out.print("Inputkan jam nya = ");
        int hours = sc.nextInt();
        int totalBacteri = countBakteri(hours, jumlahBacteri);
        System.out.println("Jumlah bakteri setelah " + hours + " jam: " + totalBacteri);
    }


    private static int countBakteri(int hours, int initialBacteri) {
        if (hours == 0) {
            return initialBacteri;
        }
        int newBacteri = initialBacteri * 2;
        return countBakteri(hours - 1, newBacteri);
    }
}




