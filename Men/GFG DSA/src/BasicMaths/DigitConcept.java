package BasicMaths;

import java.util.Scanner;

public class DigitConcept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the digit : ");
        int n  = sc.nextInt();

            while (n > 0){
                int ld = n % 10;
                System.out.print(ld+ " ");

                n = n / 10;
        }

    }
}
