package Arrays;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("Enter size of array");

        int[] arr = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();


        int x = 5;
        boolean flag = false; // mil gaya
        for (int i = 0; i < arr.length; i++) {
            {
                if (arr[i] == 5){
                    flag = true;
                    break;
                }

            }
if(flag == false)
    System.out.println("Nahi mila ");
   else
       System.out.println("Mil gaya");




        }
    }
}
