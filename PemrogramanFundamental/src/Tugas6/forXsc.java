package Tugas6;

import static java.lang.System.out;

public class forXsc {
    public static void main(String[]afd){

        for(int verse=0;verse<=2;verse++){
            out.print("Al's all wet.");
            out.println("oh,why is Al all wet?oh,");
            out.print("Al's all wet 'cause");
            out.println("He's standing in the rain ");
            out.println("Why is Al out in the rain?");

            switch (verse) {
                case 1:
                    out.println("That's because he has no brain.");
                    break;
                case 2:
                    out.println("That's because he is a pain.");
                    break;
                case 3:
                    out.println("'Cause this is the last refrain.");
                    break;
            }
            switch (verse) {
                case 3:
                    out.println("Last refrain, last refrain,");
                case 2:
                    out.println("He's a pain, he's a pain,");
                case 1:
                    out.println("Has no brain, has no brain,");
            }
            out.println("In the rain, in the rain.");
            out.println("Ohhhhhhhh...");
            out.println();

        }
        out.print("Al's all wet. ");
        out.println("Oh, why is Al all wet? Oh,");
        out.print("Al's all wet 'cause ");
        out.println("he's standing in the rain.");
    }
}
