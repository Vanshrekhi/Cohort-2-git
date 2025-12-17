
package PatternPrinting;

import java.util.Scanner;

public class StraTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows n : ");
        int n = sc.nextInt();
//        System.out.println("enter colms m : ");
//        int m = sc.nextInt();

//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//
//                if ((i + j) > n )  // for odd
//                    System.out.print("* ");
//                else
//                    System.out.print(" " +  " ");
//            }
//
//            System.out.println();
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {

                System.out.print(" " + " ");
            }
            for (int j = 1; j <=  i; j++) {

                System.out.print((char)(j+64) + " ");
            }

                System.out.println();
            }
        }

    }



