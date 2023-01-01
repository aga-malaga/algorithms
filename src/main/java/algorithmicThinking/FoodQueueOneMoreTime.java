package algorithmicThinking;

public class FoodQueueOneMoreTime {
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[] queues = {3, 2, 5};
        solve(n, m, queues);
    }

    private static void solve(int n, int m, int[] queues) {
        for (int i = 0; i < m; i++) {
            int shortest = showShortestQueue(queues);
            System.out.println(queues[shortest]);
            queues[shortest]++;
        }

    }

    private static int showShortestQueue(int[] queues) {
        int shortest = 0;
        for (int i = 1; i < queues.length; i++) {
            if (queues[i] < queues[shortest]){
                shortest = i;
            }
        }
        return shortest;
    }
}
