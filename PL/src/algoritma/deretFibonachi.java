package algoritma;
import java.util.Scanner;

public class deretFibonachi {

        public static void main(String[] abc) {
            Scanner pf = new Scanner(System.in);
            int i ,n ,fn ,fn1 ,fn2;
            System.out.print("Inputkan n=");
            n= pf.nextInt();
            fn2=0;
            fn1=1;
            fn=1;

            for(i=1 ; i<=n ; i++){
                System.out.println("nilai ke-"+i + "     adalah : "+fn);
                fn=fn1+fn2;
                fn2=fn1;
                fn1=fn;

            }
        }
    }


