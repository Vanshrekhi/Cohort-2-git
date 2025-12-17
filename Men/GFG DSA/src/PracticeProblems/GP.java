package PracticeProblems;

import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any integer : ");
        int num = sc.nextInt();

        int a = 1, r = 2;
        for (int i = 1; i <= num ; i++) {
            System.out.println(a + " ");
            a*=r;


        }
    }
}
