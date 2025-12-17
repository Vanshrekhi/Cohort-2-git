import java.util.Scanner;
public class PrimeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        int num = sc.nextInt();

        boolean flag = false;
        for (int i = 2; i < Math.sqrt(num) - 1; i++) {

            if(num % i == 0) {

                flag = true;
                break;
            }
        }
        if(num == 1)
            System.out.println("Neither Prime nor Composite");
                else if(flag == false)
            System.out.println("PRIME NO");

        else


        System.out.println("COMPOSITE NO.");
        }


}
