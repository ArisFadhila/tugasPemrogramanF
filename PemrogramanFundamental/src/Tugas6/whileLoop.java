package Tugas6;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class whileLoop {
    public static void main (String []afd){
        Scanner sc = new Scanner(System.in);
        int numGuesses = 0;
        int randomNumber=new Random().nextInt(10)+1;
        out.println("*************");
        out.println("Welcome to the gguessing game");
        out.println("*************");
        out.println();
        out.print("Enter an int from 1 to 10:");
        int inputNumber = sc.nextInt();
        numGuesses++;

        while (inputNumber != randomNumber){
            out.println();
            out.println("Try Again..");
            out.print("Enter an int from 1 to 10:");
            inputNumber=sc.nextInt();
            numGuesses++;

        }
        out.print("You win after");
        out.println(numGuesses+ "Guesses.");
        sc.close();
    }
}
