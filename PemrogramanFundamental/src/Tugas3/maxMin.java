package Tugas3;

import java.util.Scanner;

public class maxMin {
    public static void main(String[]bcd){
        Scanner af = new Scanner(System.in);
        System.out.println("bismillah");

        System.out.print("Masukkan Max: ");
        int max = af.nextInt();

        System.out.print("Masukkan Min: ");
        int min = af.nextInt();

        System.out.print("Masukkan Interval: ");
        int interval = af.nextInt();

        if ((max - min) % interval == 0) {
            int n = (max - min) / interval;
            int i = 1;
            int sum = 0;

            while (i <= n) {
                sum =  sum + min;
                min = min + interval;
                i = i + 1;
            }

            System.out.println("Total Sum: " + sum);
        } else {
            System.out.println("Sum tidak bisa dihitung");
        }
    }
}
