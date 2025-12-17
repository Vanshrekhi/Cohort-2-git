package PatternPrinting;

import java.util.Scanner;

public class star5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of Tests : ");
        int t = sc.nextInt();

        for (int test = 1; test < t ; test++) {
            System.out.println("Enter the no. of test cases for test no. " + test + " : ") ;
            int n = sc.nextInt();

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n ; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }
//            for (int i = 0; i <= n; i++) {
//                for (int j = 0; j <= i ; j++) {
//                    System.out.print("1 ");
//
//                }
//                System.out.println();
//            }
            for (int i = 0; i <= n; i++) {

                // Space
                for (int j = 0; j <= n - 1 -i ; j++) {
                    System.out.print(" ");
                }
                
                //star
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("* ");
                    
                }
                
                //space
                for (int j = 1; j <= n - 1 -i ; j++) {
                    System.out.print(" ");
                }

                System.out.println();
            }
        }


    }
}
