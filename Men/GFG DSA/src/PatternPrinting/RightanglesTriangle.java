
package PatternPrinting;

import java.util.Scanner;
public class RightanglesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines & colms: ");
        int n = sc.nextInt();
//
//        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
//                System.out.print(j+ " ");

                if(i % 2 == 0){
                    System.out.print((char)(j+64)+ " ");
                }
                else {
                    System.out.print(j + " ");
                }

            }
            System.out.println(" ");


        }


//            System.out.println("******");
//            System.out.println("******");
//            System.out.println("******");
    }
}

