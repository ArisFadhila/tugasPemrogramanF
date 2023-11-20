package Tugas6;
import java.io.File;
import java.util.Scanner;

import static java.lang.System.out;

public class dowhileXifelse {
    public static void main(String[]afd){
        File evidence = new File("cookedBook.txt");
        Scanner sc = new Scanner (System.in);
        char reply;

        do {
            out.print("Delete evidence? (y/n) ");
            reply =
                    sc.findWithinHorizon(".",0).charAt(0);

        } while (reply != 'y' && reply != 'n');

        if (reply == 'y') {
            out.println("Okay, here goes...");
            evidence.delete();
            out.println("The evidence has been deleted.");
        } else {
            out.println("Sorry, buddy. Just asking.");
        }
        sc.close();


    }
}
