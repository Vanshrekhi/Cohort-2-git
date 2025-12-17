package PracticeProblems;

import java.util.Scanner;
public class index {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // For user input from keyboard

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

      if (num % 13 == 0 ){
          System.out.println("True");

      }
      else{
            System.out.println("False");
      }

    }
}
