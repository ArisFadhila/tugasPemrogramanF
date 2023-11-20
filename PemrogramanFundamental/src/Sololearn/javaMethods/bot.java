package Sololearn.javaMethods;

import java.util.Scanner;

public class bot {
    public static void main(String[]afd){ bot();}
    public static void bot (){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
         switch (num){
             case 1 :
                 System.out.println("Order Confirmed");
             case 2 :
                 System.out.println("info@Sololearn.com");
             break;
             default:
                 System.out.println("Try Again");
         }

    }
}
