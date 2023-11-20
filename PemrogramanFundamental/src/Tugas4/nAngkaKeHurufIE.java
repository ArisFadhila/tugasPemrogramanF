package Tugas4;

import java.util.Scanner;
import static java.lang.System.out;

public class nAngkaKeHurufIE {
    public static void main (String []afd){
        Scanner sc = new Scanner(System.in);
        out.print("masukkan nilai= ");
        double nilai =sc.nextDouble();

        if(nilai>=80.0&& nilai<= 100.0 ){
            out.println("nilai= A");
        }else if(nilai>=70.0 && nilai<=79.99){
            out.println("nilai=B");
        }else if(nilai>=60.0 && nilai<=69.9){
            out.println("nilai=C");
        }else if(nilai>=50.0 && nilai<=59.99){
            out.println("nilai=D");
        }else if(nilai>=0 && nilai<=49.99){
            out.println("nilai=E");

        }else{
            out.println("salah woii");
        }

    }
}
