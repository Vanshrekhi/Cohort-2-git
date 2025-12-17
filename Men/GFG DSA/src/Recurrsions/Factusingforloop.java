package Recurrsions;
import java.util.Scanner;
public class Factusingforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= n ; i++) {


            fact = n * (n - fact);
            fact++;
            System.out.println(fact);

        }
    }
}
