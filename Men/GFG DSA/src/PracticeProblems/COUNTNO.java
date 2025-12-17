package PracticeProblems;

import java.util.Scanner;
public class COUNTNO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
            int n = sc.nextInt();  //123456
        int sum = 1;

        while(n!= 0){
            int ld  = n % 10;
            if(ld != 0){
                sum =sum * ld; // sum += ld;
                n= n /10; // n /= 10;
            }



        }

        System.out.println(sum);
    }
}
