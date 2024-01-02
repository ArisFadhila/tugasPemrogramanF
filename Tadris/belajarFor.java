package Tadris;

import java.util.Scanner;

public class belajarFor {
   // public static void main(String[] args) {

           /* int n = 10, firstTerm = 0, secondTerm = 1;
            System.out.println("Fibonacci Series till " + n + " terms:");

            for (int i = 1; i <= n; ++i) {
                System.out.print(firstTerm + ", ");

                // compute the next term
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;*/
        public static void main(String[] args) {
        Scanner pf = new Scanner(System.in);

        int n,fn,fn1,fn2,i;

        System.out.print("Input N=");
        n = pf.nextInt();
        fn2=0;
        fn1=1;
        fn=1;

        i=0;
        while( i <= n ){
            i++;
            System.out.println("nilai ke-"+i+"adalah "+fn);
            fn=fn1 + fn2;
            fn2=fn1;
            fn1=fn;

        }
    }
}
