package algorithmicThinking;

import java.math.BigInteger;
import java.time.LocalTime;

class BurgerFever {

    static BigInteger counter = BigInteger.ZERO;

    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        solve(4, 2, 90);
        System.out.println(LocalTime.now());
        System.out.println(counter);
    }

    public static void solve(int m, int n, int t){
        int result, i;
        result = solveT(m, n, t);
        if (result >= 0){
            System.out.printf("%d\n", result);
        } else {
            i = t - 1;
            result = solveT(m, n ,i);
            while (result == -1){
                i--;
                result = solveT(m, n, i);
            }
            System.out.printf("burgers to eat: %d, time to drink: %d\n", result, t - i);
        }

    }
    public static int solveT(int m, int n, int t) {
        counter = counter.add(BigInteger.ONE);
        int first;
        int second;
        if (t == 0) {
            return 0;
        }
        if (t >= m) {
            first = solveT(m, n, t - m);
        } else {
            first = -1;
        }
        if (t >= n) {
            second = solveT(m, n, t - n);
        } else {
            second = -1;
        }
        if (first == -1 && second == -1) {
            return -1;
        } else {
            return max(first, second) + 1;
        }
    }

    private static int max(final int first, final int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

}
