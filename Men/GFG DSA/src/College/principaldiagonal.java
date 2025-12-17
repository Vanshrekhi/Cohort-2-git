import java.util.Scanner;

public class principaldiagonal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter elements on array : ");
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
                System.out.println();

        }
    }
}