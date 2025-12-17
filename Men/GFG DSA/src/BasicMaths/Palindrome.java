package BasicMaths;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the digit : ");
        int n  = sc.nextInt();

        int dup = n;
        int rev = 0;
        while (n > 0){
            int ld = n % 10;

            rev = (rev * 10) + ld;
            n = n / 10;

        }
        System.out.print(rev);
        System.out.println();
        if(rev == dup) {
            System.out.println("No. is palindrome");
        }
            else{
                System.out.println("No. is not a Palindrome");

        }
    }
}

