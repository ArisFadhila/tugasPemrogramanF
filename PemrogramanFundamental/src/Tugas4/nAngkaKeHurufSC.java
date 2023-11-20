package Tugas4;

import java.util.Scanner;

public class nAngkaKeHurufSC {
    public static void main (String [] afd){
        Scanner sc = new Scanner(System.in);
        System.out.println("bismillah");
        System.out.println("------------------------");
        System.out.print("masukkan angka=");
        double angka = sc.nextDouble();


        switch ((int) (angka/10.0)){
            case 10:
            case 9 :
            case 8 :
                System.out.println("Nilai huruf = A");
                break;
            case 7:
                System.out.println("Nilai huruf = B");
                break;
            case 6:
                System.out.println("Nilai huruf = C");
                break;
            case 5:
                System.out.println("Nilai huruf = D");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Nilai huruf=E");
        }
    }
}
