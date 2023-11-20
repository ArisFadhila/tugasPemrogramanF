package Sololearn.controlFlow;

import java.util.Scanner;

public class sum {
    public class Program {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int sum = 0;
            int num = 1;
            while (num <=N){
                sum += num;
                num ++;
            } System.out.println(sum);

        }

    }
}
