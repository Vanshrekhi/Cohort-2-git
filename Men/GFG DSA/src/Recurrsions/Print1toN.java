package Recurrsions;

public class Print1toN {
    static void print1toNN(int n){
        if (n == 0){
            return;
        }
        print1toNN(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = 5;
         print1toNN(n);
    }
}


