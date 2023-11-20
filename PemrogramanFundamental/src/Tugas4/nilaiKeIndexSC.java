package Tugas4;

import java.util.Scanner;

public class nilaiKeIndexSC {
    public static void main(String[]afd){
        Scanner sc=new Scanner (System.in);
        System.out.println("___________________________");
        System.out.print("Masukkan variabel=");
        String variabel=sc.nextLine();

        switch (variabel){
            case "A":
                System.out.println("Nilai angka=4.0");
                break;
            case "B":
                System.out.println("Nilai angka=3.0");
                break;
            case "c":
                System.out.println("Nilai angka=2.0");
                break;
            case "D":
                System.out.println("Nilai angka=1.0");
                break;
            case "E":
                System.out.println("Nilai angka=0.0");
                break;
            default:
                System.out.println("apa niiiii");
        }
    }
}
