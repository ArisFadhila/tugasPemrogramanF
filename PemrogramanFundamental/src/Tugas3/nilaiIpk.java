package Tugas3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class nilaiIpk {
    public static void main(String[]afd){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inputkan Nilai");
        int Nilai =sc.nextInt();

        if(Nilai>=80 && Nilai <=100){
            System.out.println("A");
            System.out.println("4.0");
        }else if(Nilai>=70 && Nilai <80){
            System.out.println("B");
            System.out.println("3.0");
        }else if(Nilai>=60 && Nilai <70){
            System.out.println("C");
            System.out.println("2.0");
        } else if (Nilai>=50 && Nilai <60) {
            System.out.println("D");
            System.out.println("1.0");
        } else if (Nilai >= 0 && Nilai < 50) {
            System.out.println("E");
            System.out.println("0");
        }else {
            System.out.println("ERROR");
        }


    }
}
