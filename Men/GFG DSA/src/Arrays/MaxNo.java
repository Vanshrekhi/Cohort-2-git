package Arrays;

public class MaxNo {
    public static void main(String[] args) {

        int[] arr = { 10, 50, 30, 2 , 3 , 60 , 37};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(max < arr[i]){
                max = arr[i];
                System.out.println(max);
            }

        }
//        System.out.println(max);
    }
}
