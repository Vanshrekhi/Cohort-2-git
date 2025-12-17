package Recurrsions;

public class Factorial {

    public static int calcFact(int n){

        if(n == 1 || n == 0){
            return 1;
        }
        int fact_m = calcFact(n - 1);
        int fact_n = n * fact_m;
        return fact_n;
    }
    public static void main(String[] args) {

        int n = 5;
       int ans =  calcFact(n);
        System.out.println(ans);
    }
}
