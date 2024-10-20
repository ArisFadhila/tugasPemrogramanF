package rekursif;

import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inputkan angka = ");
        int angka= sc.nextInt();
        System.out.println("Faktorial dari "+angka+ " adalah : " +faktoriall(angka));
}
    static int faktoriall( int n ) {

        if (n == 1) {
            return 1;
        } else {
        return(n * faktoriall(n-1));
    }
        }

}
