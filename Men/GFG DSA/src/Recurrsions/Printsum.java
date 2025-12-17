package Recurrsions;

public class Printsum {

    public static void printsuum(int i, int n, int sum){

        if(i == n){
            sum = sum + i;
            System.out.println(sum);
            return;
        }

        sum = sum + i;
        printsuum(i + 1, n , sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        printsuum(1, 5, 0);
    }
}

