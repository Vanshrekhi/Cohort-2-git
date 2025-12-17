package Arrays;

import java.util.Scanner;

public class MarksofStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] marks = {50, 30, 64, 25, 85, 100};

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35)
                System.out.println(i + " ");
        }
    }
}

