package algorithmicThinking;

public class FactorialStack {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }

    public static int countdown(int x) {
        if (x == 0) {
            return x;
        } else {
            System.out.println(x - 1);
            return countdown(x - 1);
        }
    }

    public static int power(int base, int power) {
        if (power != 0) {
            return base * power(base, power - 1);
        } else {
            return 1;
        }
    }

    public static int factorial(int x) {
        if (x == 1) {
            return x;
        } else {
            return x * factorial(x - 1);
        }
    }
}
