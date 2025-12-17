package Recurrsions;

public class PrintNtimes {

     static void printN(String name, int n){

        if(n <= 0){ // base condition
            return;
        }
         System.out.println(name);
        printN(name, n -1); // recurssive call

    }
    public static void main(String[] args) {
        String name = "Vansh Rekhi";
        int n = 5;
        printN(name, n); // Method call
    }
}
