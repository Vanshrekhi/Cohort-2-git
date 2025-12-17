package BasicMaths;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the digit : ");
        int n  = sc.nextInt();

        int dup = n;
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            sum = sum + (ld * ld * ld);
            n = n / 10;

        }
        System.out.println(sum);
        if(sum == dup){
            System.out.println("No. is an armstrong no");
        }
        else {
            System.out.println("Not an Armstrong no.");
        }

        }
}
