package Arrays;

import java.util.Scanner;

public class Sumofmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();

        int[] marks = {10, 20, 30, 40};
int s = 0;
        for (int i = 0; i < marks.length; i++) {

          s =s+ marks[i];
        }
        System.out.println(s);

    }
}
