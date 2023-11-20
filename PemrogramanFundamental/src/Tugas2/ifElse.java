package Tugas2;

import java.util.Scanner;

public class ifElse {
    public static void main(String[]afd){
        Scanner sc= new Scanner(System.in);

        System.out.println("Masukkan Username=");
        String username=sc.next();

    if (username.equals("Aris")){
        System.out.println("Masukkan Pasword=");
        String password=sc.next();

        if(password.equals("275")){
            System.out.println("Anda benar");
        }else {
            System.out.println("Periksa password");
        }
        }else{
            System.out.println("user tidak dikenal");
        }
    sc.close();
    }
}
