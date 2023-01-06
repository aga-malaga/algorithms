package algorithmicThinking;

class FoodQueue {

    public static int[] solve(int[] queues, int n, int m) {
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int shortest = shortestLine(queues);
            result[i] = queues[shortest];
            queues[shortest]++;
        }
        return result;
    }

    public static int shortestLine(int[] queues) {
        int result = 0;
        for (int i = 1; i < queues.length; i++) {
            if (queues[i] < queues[result]) {
                result = i;
            }
        }
        return result;
    }
}
