package algoritma;

import java.util.Scanner;

public class fibonachi {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n ;
            System.out.print("Bilangan fibonachi ke-->");
            n = sc.nextInt();
            int hasil = fibonacci(n);
            System.out.println("Nilai Fibonacci untuk n=" + n + " adalah: " + hasil);
        }

        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }