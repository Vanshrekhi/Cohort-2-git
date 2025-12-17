

import java.util.Scanner;
public class REV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

//        for (int i = 0; i <= n ; i++) {
//        }
        while ((n != 0)) {
            int digit = n % 10;
            System.out.print(digit);

//        }
            n = n / 10;
        }
    }
}
