package Sololearn.arrays;

import java.util.Scanner;

public class vendingM {
        public static void main(String[] args) {
            String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if (choice ==0){
                System.out.println(menu[0]);
            } else if (choice==1){
                System.out.println(menu[1]);
            } else if (choice==2){
                System.out.println(menu[2]);
            } else if (choice==3){
                System.out.println(menu[3]);
            } else if (choice==4){
                System.out.println(menu[4]);
            } else if (choice==5){
                System.out.println(menu[5]);
            } else {
                System.out.println("Invalid");
            }
        }

}
