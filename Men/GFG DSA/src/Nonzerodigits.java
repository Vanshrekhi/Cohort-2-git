import java.util.Scanner;

public class Nonzerodigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();  //123456

        while (n != 0) {
            int digit = n % 10;

            if (digit != 0) {
                System.out.println(digit);

            }
            n /= 10;

        }

    }
}