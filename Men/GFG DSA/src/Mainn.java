class Algebra {
    int a = 50;
    int b = 60;

    int add() {
        int p = 40;
        int q = 89;
        return a + b;
    }

    int sub() {
        return a - b;
    }

    void demo() {
        int a = 10;
        System.out.println("Local a in demo(): " + a);  // 10
    }
}

public class Mainn {
    public static void main(String[] args) {
        Algebra obj = new Algebra();

        System.out.println("Addition: " + obj.add());
        System.out.println("Subtraction: " + obj.sub());
        obj.demo();
    }
}
