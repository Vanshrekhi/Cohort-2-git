package PracticeProblems;

import java.util.Scanner;
public class APfrom4710 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any integer : ");
        int num = sc.nextInt();

        int a = 4, d = 3;
//        for (int i = 4; i <= 3*num + 3 ; i+=3) {
//            System.out.println(i);

        for (int i = 1; i <= num ; i++) {
            System.out.println(a+ " ");
            a+=d;


        }
    }
}
