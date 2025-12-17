package PatternPrinting;

import java.util.Scanner;

public class No0to1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of lines & columns: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

//                if (i % 2 != 0) { // Odd row
//                    if (j % 2 != 0)
//                        System.out.print("1 ");
//                    else
//                        System.out.print("0 ");
//                } else { // Even row
//                    if (j % 2 == 0)
//                        System.out.print("1 ");
//                    else
//                        System.out.print("0 ");
//                }
                if((i % 2 == 0 && j % 2 == 0) ||  (i % 2 != 0 && j % 2 != 0 )){
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
