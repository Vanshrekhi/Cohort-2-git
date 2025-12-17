import java.util.Scanner;
public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10 ; i++) {
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();



        switch (num){
            case 1:
                System.out.println("Its Monday");
                break;

            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thrusday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
            default:
                System.out.println("You have enter wrong Number. Please try again !!");

        }
        }
    }
}
