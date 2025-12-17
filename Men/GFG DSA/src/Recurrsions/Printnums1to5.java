package Recurrsions;

public class Printnums1to5 {

    public static void Printnums(int n){

        if(n == 6){
            return;
        }
        System.out.println(n);
        Printnums(n + 1);
    }

    public static void main(String[] args) {

        int n = 1;
        Printnums(n);
    }
}
