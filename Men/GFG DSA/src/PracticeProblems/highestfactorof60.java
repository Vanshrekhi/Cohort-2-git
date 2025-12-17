package PracticeProblems;

import java.util.Scanner;
public class highestfactorof60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any integer : ");
        int num = sc.nextInt();

        int hf = 1;
        for (int i = num - 1; i >= 1  ; i--) {
            if(num % i == 0){
                hf = i;
                break;
            }
        }
        System.out.println(hf);
    }
}
