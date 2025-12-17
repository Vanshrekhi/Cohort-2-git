package Recurrsions;


public class Functions {

    public static void Printnum(int n){
        if(n == 0) {
            return;   // base conditions
        }
        System.out.println(n);
        Printnum(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        Printnum(n);    //Recursions
    }
}

