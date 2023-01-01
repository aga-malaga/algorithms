package algorithmicThinking;

import java.util.Scanner;

public class FoodQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //n= queues number
        int n = scanner.nextInt();
        int[] array = new int[n];
        //m= new people
        int m = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        findQueue(array, m);

    }

    public static void findQueue(int[] array, int newPeople) {
        if (array.length > 100 || newPeople > 100) {
            System.out.println("Numbers must be smaller than 100");
            return;
        }

        for (int i = 0; i < newPeople; i++) {
            int shortest = findShortest(array);
            System.out.println(String.format("%d", array[shortest]));
            array[shortest]++;

        }

    }

    private static int findShortest(int[] array) {
        int i;
        int shortest = 0;
        for (i = 1; i < array.length; i++) {
            if (array[i] < array[shortest]) ;
            shortest = i;
        }
        return shortest;
    }

}
