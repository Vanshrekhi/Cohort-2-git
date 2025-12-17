package PatternPrinting;

import java.util.Scanner;
import java.util.Scanner;
public class Starcross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows n : ");
        int n = sc.nextInt();
        System.out.println("enter colms m : ");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
//
                if (i == j || i + j == n + 1  )  // for odd
                System.out.print("* ");
                    else
                       System.out.print("  ");
            }

                System.out.println();


            }
        }

}


