package PatternPrinting;

import java.util.Scanner;
public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines & colms: ");
        int n = sc.nextInt();

        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.print((char)(j + 64)+  " ");
            }
            System.out.println(" ");


        }


//            System.out.println("******");
//            System.out.println("******");
//            System.out.println("******");
    }

    public static class Starplus {
    }
}

